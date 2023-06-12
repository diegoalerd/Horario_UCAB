
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
 * @author diaz_
 */
public class controlXMLAE {
    private Element root2;
    private String fileLocation = "src//archivosXML//actividad.xml"; 
    
    public controlXMLAE() {
          try {
            SAXBuilder builder = new SAXBuilder(false);
            Document doc = null;
            doc = builder.build(fileLocation);
            root2 = doc.getRootElement();
        } catch (JDOMException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        }
    }
    
        private Element ActividadtoXmlElement(Actividad A){
        Element Item = new Element("ActividadExtracurricular");
        Element Actividad = new Element("ActividadE");
        Actividad.setText(A.getNombreAExtra());
        Element NroActividadE = new Element("NroActividad");
        NroActividadE.setText(Integer.toString(A.getNroActividadE()));            
        Element DiaE1 = new Element("DiaE1");
        DiaE1.setText(A.getDiaE1());
        Element DiaE2 = new Element("DiaE2");
        DiaE2.setText(A.getDiaE2());
        Element DiaE3 = new Element("DiaE3");
        DiaE3.setText(A.getDiaE3());
        Element DiaE4 = new Element("DiaE4");
        DiaE4.setText(A.getDiaE4());
        Element DiaE5 = new Element("DiaE5");
        DiaE5.setText(A.getDiaE5());
        Element horaIE1 = new Element("horaIE1");
        horaIE1.setText(A.getHoraIE1());
        Element horaIE2 = new Element("horaIE2");
        horaIE2.setText(A.getHoraIE2());
        Element horaIE3 = new Element("horaIE3");
        horaIE3.setText(A.getHoraIE3());
        Element horaIE4 = new Element("horaIE4");
        horaIE4.setText(A.getHoraIE4());
        Element horaIE5 = new Element("horaIE5");
        horaIE5.setText(A.getHoraIE5());
        Element horaFE1 = new Element("horaFE1");
        horaFE1.setText(A.getHoraFE1());
        Element horaFE2 = new Element("horaFE2");
        horaFE2.setText(A.getHoraFE2());
        Element horaFE3 = new Element("horaFE3");
        horaFE3.setText(A.getHoraFE3());
        Element horaFE4= new Element("horaFE4");
        horaFE4.setText(A.getHoraFE4());
        Element horaFE5 = new Element("horaFE5");
        horaFE5.setText(A.getHoraFE5());
        
        
        Item.addContent(Actividad);
        Item.addContent(NroActividadE);
        
        Item.addContent(DiaE1);
        Item.addContent(DiaE2);
        Item.addContent(DiaE3);
        Item.addContent(DiaE4);
        Item.addContent(DiaE5);
        
        Item.addContent(horaIE1);
        Item.addContent(horaIE2);
        Item.addContent(horaIE3);
        Item.addContent(horaIE4);
        Item.addContent(horaIE5);
        
        Item.addContent(horaFE1);
        Item.addContent(horaFE2);
        Item.addContent(horaFE3);
        Item.addContent(horaFE4);
        Item.addContent(horaFE5);
        
        return Item;
    }
        
        private boolean updateDocument() {
        try {
            XMLOutputter out = new XMLOutputter(org.jdom.output.Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream(fileLocation);
            out.output(root2, file);
            file.flush();
            file.close();
            return true;
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }
        
     public boolean agregarActividadXMLE(Actividad A) {
        boolean resultado2 = false;
        root2.addContent(ActividadtoXmlElement((Actividad) A));
        resultado2 = updateDocument();
        return resultado2;
    }
     
       public Actividad XmltoObject2 (Element a) throws ParseException{
        Actividad Act;
        Act = new Actividad(a.getChildText("ActividadE"),
                Integer.parseInt(a.getChildText("NroActividad")),
                a.getChildText("DiaE1"),
                a.getChildText("DiaE2"),
                a.getChildText("DiaE3"),
                a.getChildText("DiaE4"),
                a.getChildText("DiaE5"),
                a.getChildText("horaIE1"),
                a.getChildText("horaIE2"),
                a.getChildText("horaIE3"),
                a.getChildText("horaIE4"),
                a.getChildText("horaIE5"),
                a.getChildText("horaFE1"),
                a.getChildText("horaFE2"),
                a.getChildText("horaFE3"),
                a.getChildText("horaFE4"),
                a.getChildText("horaFE5")
        );
       
        return Act;
    }
    
        public ArrayList<Actividad> listaAExtraxml(){
        ArrayList<Actividad> resul = new ArrayList<Actividad>();
        for(Object it : root2.getChildren()){
            Element xml2 = (Element) it;
            try{
                resul.add(XmltoObject2(xml2));
            } catch (ParseException ex){
                System.out.println(ex.getMessage());
            }
        }
        return resul;
    }
       
 

        public static Element buscar(List raiz, String NroActE) {
        Iterator i = raiz.iterator();
        while (i.hasNext()) {
            Element a = (Element) i.next();
            if ((NroActE.equals(a.getChild("NroActividad").getText()))) {
                return a;
            }
        }
        return null;
    }
         
        public Actividad buscarActividad(Integer NroAct) {
        Element aux = new Element("ActividadExtracurricular");
        List Actividad = this.root2.getChildren("ActividadExtracurricular");
        while (aux != null) {
            aux = controlXMLAE.buscar(Actividad,Integer.toString(NroAct));
            if (aux != null) {
                try {
                    return XmltoObject2(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }
        
      public boolean actualizarActividad(Actividad ActAE) {
        boolean resultado = false;
        Element aux = new Element("ActividadExtracurricular");
        List Actividades = this.root2.getChildren("ActividadExtracurricular");
        while (aux != null) {
            aux = controlXMLAE.buscar(Actividades, Integer.toString(ActAE.getNroActividadE()));
            if (aux != null) {
                Actividades.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarActividadXMLE(ActAE);
        return resultado;
    }
        
               
     public boolean borrarActividad(Integer NroactE) {
        boolean resultado = false;
        Element aux = new Element("ActividadExtracurricular");
        List Act = this.root2.getChildren("ActividadExtracurricular");
        while (aux != null) {
            aux = controlXMLAE.buscar(Act,Integer.toString(NroactE));
            if (aux != null) {
                Act.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
     
     
    
    }

