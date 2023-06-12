/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoXML;

import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import clases.*;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom.output.XMLOutputter;
import Controlador.*;

/**
 *
 * @author meggu
 */
public class controlXML {
    private Element root;
    private String fileLocation = "src//archivosXML//materias.xml";

    public controlXML() {
        try {
            SAXBuilder builder = new SAXBuilder(false);
            Document doc = null;
            doc = builder.build(fileLocation);
            root = doc.getRootElement();
        } catch (JDOMException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        }
    }
    
    private Element MateriatoXmlElement(Materia M){
        Element Item = new Element("Item");
        Element Materia = new Element("Materia");
        Materia.setText(M.getMateria());
        Element Profesor = new Element("Profesor");
        Profesor.setText(M.getProfesor());
        Element Carrera = new Element("Carrera");
        Carrera.setText(M.getCarrera());
        Element NRC = new Element("NRC");
        NRC.setText(Integer.toString(M.getNrc()));
        Element Dia1 = new Element("Dia1");
        Dia1.setText(M.getDia1());
        Element Dia2 = new Element("Dia2");
        Dia2.setText(M.getDia2());
        Element Dia3 = new Element("Dia3");
        Dia3.setText(M.getDia3());
        Element HoraI1 = new Element("HoraI1");
        HoraI1.setText(M.getHoraI1());
        Element HoraI2 = new Element("HoraI2");
        HoraI2.setText(M.getHoraI2());
        Element HoraI3 = new Element("HoraI3");
        HoraI3.setText(M.getHoraI3());
        Element HoraF1 = new Element("HoraF1");
        HoraF1.setText(M.getHoraF1());
        Element HoraF2 = new Element("HoraF2");
        HoraF2.setText(M.getHoraF2());
        Element HoraF3 = new Element("HoraF3");
        HoraF3.setText(M.getHoraF3());
        
        
        Item.addContent(Materia);
        Item.addContent(Profesor);
        Item.addContent(Carrera);
        Item.addContent(NRC);
        
        Item.addContent(Dia1);
        Item.addContent(Dia2);
        Item.addContent(Dia3);
        
        Item.addContent(HoraI1);
        Item.addContent(HoraI2);
        Item.addContent(HoraI3);
        
        Item.addContent(HoraF1);
        Item.addContent(HoraF2);
        Item.addContent(HoraF3);
        
        return Item;
    }
    
    private boolean updateDocument() {
        try {
            XMLOutputter out = new XMLOutputter(org.jdom.output.Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream(fileLocation);
            out.output(root, file);
            file.flush();
            file.close();
            return true;
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }
    
    public boolean agregarMateriaXML(Materia M) {
        boolean resultado = false;
        root.addContent(MateriatoXmlElement((Materia) M));
        resultado = updateDocument();
        return resultado;
    }
    
    public Materia XmltoObject(Element e) throws ParseException{
        Materia Mat = new Materia(Integer.parseInt(e.getChildText("NRC")),
                                  e.getChildText("Materia"),
                                  e.getChildText("Carrera"),
                                  e.getChildText("Semestre"),
                                  e.getChildText("Profesor"),
                                  e.getChildText("Dia1"),
                                  e.getChildText("Dia2"),
                                  e.getChildText("Dia3"),
                                  e.getChildText("HoraI1"),
                                  e.getChildText("HoraI2"),
                                  e.getChildText("HoraI3"),
                                  e.getChildText("HoraF1"),
                                  e.getChildText("HoraF2"),
                                  e.getChildText("HoraF3")
        );
        return Mat;
    }
    
     public ArrayList<Materia> listaMaterias(){
        ArrayList<Materia> result = new ArrayList<Materia>();
        for(Object it : root.getChildren()){
            Element xml = (Element) it;
            try{
                result.add(XmltoObject(xml));
            } catch (ParseException ex){
                System.out.println(ex.getMessage());
            }
        }
        return result;
    }
    
     public static Element buscar(List raiz, String materia, int nrc) {
        Iterator i = raiz.iterator();
        while (i.hasNext()) {
            Element e = (Element) i.next();
            if ((e.getChild("Materia").getText().equalsIgnoreCase(materia))&&(e.getChild("NRC").getText().equals(nrc))) {
                return e;
            }
        }
        return null;
    }
     
     public Materia buscarMateria(String materia, int nrc) {
        Element aux = new Element("Item");
        List Materia = this.root.getChildren("Item");
        while (aux != null) {
            aux = controlXML.buscar(Materia, materia, nrc);
            if (aux != null) {
                try {
                    return XmltoObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }
     
     public boolean modificarMateria(Materia M) {
        boolean resultado = false;
        Element aux = new Element("Item");
        List Mat = this.root.getChildren("Item");
        while (aux != null) {
            aux = controlXML.buscar(Mat, M.getMateria(), M.getNrc());
            if (aux != null) {
                Mat.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarMateriaXML(M);
        return resultado;
    }
     
     public boolean borrarMateria(String materia, int nrc) {
        boolean resultado = false;
        Element aux = new Element("Item");
        List Mater = this.root.getChildren("Item");
        while (aux != null) {
            aux = controlXML.buscar(Mater, materia, nrc);
            if (aux != null) {
                Mater.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
     
     
     
}
