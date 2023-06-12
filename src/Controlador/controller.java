/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import paneles.*;
import clases.*;
import horario.*;
import java.util.*;
import javax.swing.*;
import manejoXML.*;
import rsbuttom.RSButtonMetro;
/**
 *
 * @author LAB_L11
 */
public class controller {
                                                                                                                     //cmbSlcnHoraFiD2  cmbSlcnHoraInD2  cmbSlcnD3  cmbSlcnHoraInD3  cmbSlcnHoraFiD3
    JComboBox cmbSlcnCarrera, cmbSlcnSemestre, cmbSemestre, cmbSlcnDia, cmbSlcnHoraInD1, cmbSlcnHoraFiD1, cmbSlcnDia2, cmbSlcnHoraFiD3, cmbSlcnHoraInD3, cmbSlcnD4, cmbSlcnHoraInD5, cmbSlcnHoraFiD5,cmbSlcnDiaE1,cmbSlcnDiaE2,cmbSlcnDiaE3,cmbSlcnDiaE4,cmbSlcnDiaE5,cmbSlcnHoraFiED1,cmbSlcnHoraFiED2,cmbSlcnHoraFiED3,cmbSlcnHoraFiED4,cmbSlcnHoraFiED5,cmbSlcnHoraInED1,cmbSlcnHoraInED2,cmbSlcnHoraInED3,cmbSlcnHoraInED4,cmbSlcnHoraInED5;
    JTextField txtProfe, txtMateria, txtNRC,txtAExtra,txtNroActividad;                                                                         //rdioHora1D3  rdioHora2D3  rdioHora3D3
    JRadioButton rdioDia1, rdioDia2, rdioDia3, rdioHora1, rdioHora2, rdioHora3, rdioHora1D2, rdioHora2D2, rdioHora3D2, rdioHora1D4, rdioHora2D4, rdioHora3D4,rdioDiaE1,rdioDiaE2,rdioDiaE3,rdioDiaE4,rdioDiaE5,rdioHoraE1D1,rdioHoraE1D2,rdioHoraE1D3,rdioHoraE1D4,rdioHoraE1D5,rdioHoraE2D1,rdioHoraE2D2,rdioHoraE2D3,rdioHoraE2D4,rdioHoraE2D5,rdioHoraE3D1,rdioHoraE3D2,rdioHoraE3D3,rdioHoraE3D4,rdioHoraE3D5;
    ButtonGroup rdioGroupDias = new ButtonGroup();    //button group para el numero de dias
    ButtonGroup rdioGroupDia1 = new ButtonGroup();    //button group para dia 1
    ButtonGroup rdioGroupDia2 = new ButtonGroup();    //button group para dia 2
    ButtonGroup rdioGroupDia3 = new ButtonGroup();    //button group para dia 3
    ButtonGroup rdioGroupDiaE = new ButtonGroup();    //button group para dia Extracurricular
    ButtonGroup rdioGroupDiaE1 = new ButtonGroup();   //button group para dia Extracurricular 1
    ButtonGroup rdioGroupDiaE2 = new ButtonGroup();   //button group para dia Extracurricular 2 
    ButtonGroup rdioGroupDiaE3 = new ButtonGroup();   //button group para dia Extracurricular 3
    ButtonGroup rdioGroupDiaE4 = new ButtonGroup();   //button group para dia Extracurricular 4
    ButtonGroup rdioGroupDiaE5 = new ButtonGroup();   //button group para dia Extracurricular 5
    rsbuttom.RSButtonMetro btnCopiar, btnAgregar, btnModificar, btnEliminar,btnAgregarE,btnModificarE,btnEliminarE,btnAModificacionE;
    controlXML XML = new controlXML(); 
    controlXMLAE XMLAE = new controlXMLAE(); 
   
    public controller() {
    }

    public controller(JComboBox cmbSlcnDiaE1, JComboBox cmbSlcnDiaE2, JComboBox cmbSlcnDiaE3, JComboBox cmbSlcnDiaE4, JComboBox cmbSlcnDiaE5, JComboBox cmbSlcnHoraFiED1, JComboBox cmbSlcnHoraFiED2, JComboBox cmbSlcnHoraFiED3, JComboBox cmbSlcnHoraFiED4, JComboBox cmbSlcnHoraFiED5, JComboBox cmbSlcnHoraInED1, JComboBox cmbSlcnHoraInED2, JComboBox cmbSlcnHoraInED3, JComboBox cmbSlcnHoraInED4, JComboBox cmbSlcnHoraInED5, JTextField txtAExtra, JTextField txtNroActividad, JRadioButton rdioDiaE1, JRadioButton rdioDiaE2, JRadioButton rdioDiaE3, JRadioButton rdioDiaE4, JRadioButton rdioDiaE5, JRadioButton rdioHoraE1D1, JRadioButton rdioHoraE1D2, JRadioButton rdioHoraE1D3, JRadioButton rdioHoraE1D4, JRadioButton rdioHoraE1D5, JRadioButton rdioHoraE2D1, JRadioButton rdioHoraE2D2, JRadioButton rdioHoraE2D3, JRadioButton rdioHoraE2D4, JRadioButton rdioHoraE2D5, JRadioButton rdioHoraE3D1, JRadioButton rdioHoraE3D2, JRadioButton rdioHoraE3D3, JRadioButton rdioHoraE3D4, JRadioButton rdioHoraE3D5, RSButtonMetro btnAgregarE, RSButtonMetro btnModificarE, RSButtonMetro btnEliminarE,RSButtonMetro btnAModificacionE) {
        this.cmbSlcnDiaE1 = cmbSlcnDiaE1;
        this.cmbSlcnDiaE2 = cmbSlcnDiaE2;
        this.cmbSlcnDiaE3 = cmbSlcnDiaE3;
        this.cmbSlcnDiaE4 = cmbSlcnDiaE4;
        this.cmbSlcnDiaE5 = cmbSlcnDiaE5;
        this.cmbSlcnHoraFiED1 = cmbSlcnHoraFiED1;
        this.cmbSlcnHoraFiED2 = cmbSlcnHoraFiED2;
        this.cmbSlcnHoraFiED3 = cmbSlcnHoraFiED3;
        this.cmbSlcnHoraFiED4 = cmbSlcnHoraFiED4;
        this.cmbSlcnHoraFiED5 = cmbSlcnHoraFiED5;
        this.cmbSlcnHoraInED1 = cmbSlcnHoraInED1;
        this.cmbSlcnHoraInED2 = cmbSlcnHoraInED2;
        this.cmbSlcnHoraInED3 = cmbSlcnHoraInED3;
        this.cmbSlcnHoraInED4 = cmbSlcnHoraInED4;
        this.cmbSlcnHoraInED5 = cmbSlcnHoraInED5;
        this.txtAExtra = txtAExtra;
        this.txtNroActividad = txtNroActividad;
        this.rdioDiaE1 = rdioDiaE1;
        this.rdioDiaE2 = rdioDiaE2;
        this.rdioDiaE3 = rdioDiaE3;
        this.rdioDiaE4 = rdioDiaE4;
        this.rdioDiaE5 = rdioDiaE5;
        this.rdioHoraE1D1 = rdioHoraE1D1;
        this.rdioHoraE1D2 = rdioHoraE1D2;
        this.rdioHoraE1D3 = rdioHoraE1D3;
        this.rdioHoraE1D4 = rdioHoraE1D4;
        this.rdioHoraE1D5 = rdioHoraE1D5;
        this.rdioHoraE2D1 = rdioHoraE2D1;
        this.rdioHoraE2D2 = rdioHoraE2D2;
        this.rdioHoraE2D3 = rdioHoraE2D3;
        this.rdioHoraE2D4 = rdioHoraE2D4;
        this.rdioHoraE2D5 = rdioHoraE2D5;
        this.rdioHoraE3D1 = rdioHoraE3D1;
        this.rdioHoraE3D2 = rdioHoraE3D2;
        this.rdioHoraE3D3 = rdioHoraE3D3;
        this.rdioHoraE3D4 = rdioHoraE3D4;
        this.rdioHoraE3D5 = rdioHoraE3D5;
        this.btnAgregarE = btnAgregarE;
        this.btnModificarE = btnModificarE;
        this.btnEliminarE = btnEliminarE;
        this.btnAModificacionE = btnAModificacionE;
    }

    
    public controller(JComboBox<String> cmbSlcnCarrera, JComboBox<String> cmbSlcnSemestre, JComboBox<String> cmbSemestre, JComboBox<String> cmbSlcnDia, JComboBox<String> cmbSlcnHoraInD1, JComboBox<String> cmbSlcnHoraFiD1, JComboBox<String> cmbSlcnDia2, JComboBox<String> cmbSlcnHoraFiD3, JComboBox<String> cmbSlcnHoraInD3, JComboBox<String> cmbSlcnD4, JComboBox<String> cmbSlcnHoraInD5, JComboBox<String> cmbSlcnHoraFiD5, JTextField txtProfe, JTextField txtMateria, JTextField txtNRC, JRadioButton rdioDia1, JRadioButton rdioDia2, JRadioButton rdioDia3, JRadioButton rdioHora1, JRadioButton rdioHora2, JRadioButton rdioHora3, JRadioButton rdioHora1D2, JRadioButton rdioHora2D2, JRadioButton rdioHora3D2, JRadioButton rdioHora1D4, JRadioButton rdioHora2D4, JRadioButton rdioHora3D4, RSButtonMetro btnCopiar, RSButtonMetro btnAgregar, RSButtonMetro btnModificar, RSButtonMetro btnEliminar, ButtonGroup rdioGroupDias, ButtonGroup rdioGroupDia1, ButtonGroup rdioGroupDia2, ButtonGroup rdioGroupDia3) {
        this.cmbSlcnCarrera = cmbSlcnCarrera;
        this.cmbSlcnSemestre = cmbSlcnSemestre;
        this.cmbSemestre = cmbSemestre;
        this.cmbSlcnDia = cmbSlcnDia;
        this.cmbSlcnHoraInD1 = cmbSlcnHoraInD1;
        this.cmbSlcnHoraFiD1 = cmbSlcnHoraFiD1;
        this.cmbSlcnDia2 = cmbSlcnDia2;
        this.cmbSlcnHoraFiD3 = cmbSlcnHoraFiD3;
        this.cmbSlcnHoraInD3 = cmbSlcnHoraInD3;
        this.cmbSlcnD4 = cmbSlcnD4;
        this.cmbSlcnHoraInD5 = cmbSlcnHoraInD5;
        this.cmbSlcnHoraFiD5 = cmbSlcnHoraFiD5;
        this.txtProfe = txtProfe;
        this.txtMateria = txtMateria;
        this.txtNRC = txtNRC;
        this.rdioDia1 = rdioDia1;
        this.rdioDia2 = rdioDia2;
        this.rdioDia3 = rdioDia3;
        this.rdioHora1 = rdioHora1;
        this.rdioHora2 = rdioHora2;
        this.rdioHora3 = rdioHora3;
        this.rdioHora1D2 = rdioHora1D2;
        this.rdioHora2D2 = rdioHora2D2;
        this.rdioHora3D2 = rdioHora3D2;
        this.rdioHora1D4 = rdioHora1D4;
        this.rdioHora2D4 = rdioHora2D4;
        this.rdioHora3D4 = rdioHora3D4;
        this.btnCopiar = btnCopiar;
        this.btnAgregar = btnAgregar;
        this.btnModificar = btnModificar;
        this.btnEliminar = btnEliminar;
        this.rdioGroupDias = rdioGroupDias;
        this.rdioGroupDia1 = rdioGroupDia1;
        this.rdioGroupDia2 = rdioGroupDia2;
        this.rdioGroupDia3 = rdioGroupDia3;
    }
    

    
    public void habilitarDias1(){      //@ HABILITAR UN DIA
        rdioHora1.setEnabled(true);
        rdioHora2.setEnabled(true);
        rdioHora3.setEnabled(true);
        cmbSlcnDia.setEnabled(true);
        cmbSlcnHoraInD1.setEnabled(true);
        cmbSlcnHoraFiD1.setEnabled(true);
        
        rdioHora1D2.setEnabled(false);
        rdioHora2D2.setEnabled(false);
        rdioHora3D2.setEnabled(false);
        cmbSlcnDia2.setEnabled(false);
        cmbSlcnHoraInD3.setEnabled(false);
        cmbSlcnHoraFiD3.setEnabled(false);
        
        rdioHora1D4.setEnabled(false);
        rdioHora2D4.setEnabled(false);
        rdioHora3D4.setEnabled(false);
        cmbSlcnD4.setEnabled(false);
        cmbSlcnHoraInD5.setEnabled(false);
        cmbSlcnHoraFiD5.setEnabled(false);
    }
    
    public void habilitarDias2(){     //@ HABILITAR DOS DIAS
        // @ DIA 1
        rdioHora1.setEnabled(true);
        rdioHora2.setEnabled(true);
        rdioHora3.setEnabled(true);
        cmbSlcnDia.setEnabled(true);
        cmbSlcnHoraInD1.setEnabled(true);
        cmbSlcnHoraFiD1.setEnabled(true);
        // @ DIA 2
        rdioHora1D2.setEnabled(true);
        rdioHora2D2.setEnabled(true);
        rdioHora3D2.setEnabled(true);
        cmbSlcnDia2.setEnabled(true);
        cmbSlcnHoraInD3.setEnabled(true);
        cmbSlcnHoraFiD3.setEnabled(true);
        // @ DIA 3
        rdioHora1D4.setEnabled(false);
        rdioHora2D4.setEnabled(false);
        rdioHora3D4.setEnabled(false);
        cmbSlcnD4.setEnabled(false);
        cmbSlcnHoraInD5.setEnabled(false);
        cmbSlcnHoraFiD5.setEnabled(false);
    }
    
    public void habilitarDias3(){      //@ HABILITAR TRES DIAS
        // @ DIA 1
        rdioHora1.setEnabled(true);
        rdioHora2.setEnabled(true);
        rdioHora3.setEnabled(true);
        cmbSlcnDia.setEnabled(true);
        cmbSlcnHoraInD1.setEnabled(true);
        cmbSlcnHoraFiD1.setEnabled(true);
        // @ DIA 2
        rdioHora1D2.setEnabled(true);
        rdioHora2D2.setEnabled(true);
        rdioHora3D2.setEnabled(true);
        cmbSlcnDia2.setEnabled(true);
        cmbSlcnHoraInD3.setEnabled(true);
        cmbSlcnHoraFiD3.setEnabled(true);
        // @ DIA 3
        rdioHora1D4.setEnabled(true);
        rdioHora2D4.setEnabled(true);
        rdioHora3D4.setEnabled(true);
        cmbSlcnD4.setEnabled(true);
        cmbSlcnHoraInD5.setEnabled(true);
        cmbSlcnHoraFiD5.setEnabled(true);
    }
    
    public void habilitarDiasE1(){      //@ HABILITAR UN DIA DE ACTIVIDAD EXTRACURRICULAR
        rdioHoraE1D1.setEnabled(true);
        rdioHoraE2D1.setEnabled(true);
        rdioHoraE3D1.setEnabled(true);
        cmbSlcnDiaE1.setEnabled(true);
        cmbSlcnHoraInED1.setEnabled(true);
        cmbSlcnHoraFiED1.setEnabled(true);
        
        rdioHoraE1D2.setEnabled(false);
        rdioHoraE2D2.setEnabled(false);
        rdioHoraE3D2.setEnabled(false);
        cmbSlcnDiaE2.setEnabled(false);
        cmbSlcnHoraInED2.setEnabled(false);
        cmbSlcnHoraFiED2.setEnabled(false);
        
        rdioHoraE1D3.setEnabled(false);
        rdioHoraE2D3.setEnabled(false);
        rdioHoraE3D3.setEnabled(false);
        cmbSlcnDiaE3.setEnabled(false);
        cmbSlcnHoraInED3.setEnabled(false);
        cmbSlcnHoraFiED3.setEnabled(false);
        
        rdioHoraE1D4.setEnabled(false);
        rdioHoraE2D4.setEnabled(false);
        rdioHoraE3D4.setEnabled(false);
        cmbSlcnDiaE4.setEnabled(false);
        cmbSlcnHoraInED4.setEnabled(false);
        cmbSlcnHoraFiED4.setEnabled(false);
        
        rdioHoraE1D5.setEnabled(false);
        rdioHoraE2D5.setEnabled(false);
        rdioHoraE3D5.setEnabled(false);
        cmbSlcnDiaE5.setEnabled(false);
        cmbSlcnHoraInED5.setEnabled(false);
        cmbSlcnHoraFiED5.setEnabled(false);
    }
    
      public void habilitarDiasE2(){      //@ HABILITAR DOS DIA DE ACTIVIDAD EXTRACURRICULAR
        rdioHoraE1D1.setEnabled(true);
        rdioHoraE2D1.setEnabled(true);
        rdioHoraE3D1.setEnabled(true);
        cmbSlcnDiaE1.setEnabled(true);
        cmbSlcnHoraInED1.setEnabled(true);
        cmbSlcnHoraFiED1.setEnabled(true);
        
        rdioHoraE1D2.setEnabled(true);
        rdioHoraE2D2.setEnabled(true);
        rdioHoraE3D2.setEnabled(true);
        cmbSlcnDiaE2.setEnabled(true);
        cmbSlcnHoraInED2.setEnabled(true);
        cmbSlcnHoraFiED2.setEnabled(true);
        
        rdioHoraE1D3.setEnabled(false);
        rdioHoraE2D3.setEnabled(false);
        rdioHoraE3D3.setEnabled(false);
        cmbSlcnDiaE3.setEnabled(false);
        cmbSlcnHoraInED3.setEnabled(false);
        cmbSlcnHoraFiED3.setEnabled(false);
        
        rdioHoraE1D4.setEnabled(false);
        rdioHoraE2D4.setEnabled(false);
        rdioHoraE3D4.setEnabled(false);
        cmbSlcnDiaE4.setEnabled(false);
        cmbSlcnHoraInED4.setEnabled(false);
        cmbSlcnHoraFiED4.setEnabled(false);
        
        rdioHoraE1D5.setEnabled(false);
        rdioHoraE2D5.setEnabled(false);
        rdioHoraE3D5.setEnabled(false);
        cmbSlcnDiaE5.setEnabled(false);
        cmbSlcnHoraInED5.setEnabled(false);
        cmbSlcnHoraFiED5.setEnabled(false);
      }
      
        public void habilitarDiasE3(){      //@ HABILITAR TRES DIAS DE ACTIVIDAD EXTRACURRICULAR
        rdioHoraE1D1.setEnabled(true);
        rdioHoraE2D1.setEnabled(true);
        rdioHoraE3D1.setEnabled(true);
        cmbSlcnDiaE1.setEnabled(true);
        cmbSlcnHoraInED1.setEnabled(true);
        cmbSlcnHoraFiED1.setEnabled(true);
        
        rdioHoraE1D2.setEnabled(true);
        rdioHoraE2D2.setEnabled(true);
        rdioHoraE3D2.setEnabled(true);
        cmbSlcnDiaE2.setEnabled(true);
        cmbSlcnHoraInED2.setEnabled(true);
        cmbSlcnHoraFiED2.setEnabled(true);
        
        rdioHoraE1D3.setEnabled(true);
        rdioHoraE2D3.setEnabled(true);
        rdioHoraE3D3.setEnabled(true);
        cmbSlcnDiaE3.setEnabled(true);
        cmbSlcnHoraInED3.setEnabled(true);
        cmbSlcnHoraFiED3.setEnabled(true);
        
        rdioHoraE1D4.setEnabled(false);
        rdioHoraE2D4.setEnabled(false);
        rdioHoraE3D4.setEnabled(false);
        cmbSlcnDiaE4.setEnabled(false);
        cmbSlcnHoraInED4.setEnabled(false);
        cmbSlcnHoraFiED4.setEnabled(false);
        
        rdioHoraE1D5.setEnabled(false);
        rdioHoraE2D5.setEnabled(false);
        rdioHoraE3D5.setEnabled(false);
        cmbSlcnDiaE5.setEnabled(false);
        cmbSlcnHoraInED5.setEnabled(false);
        cmbSlcnHoraFiED5.setEnabled(false);
        
        }
        
          public void habilitarDiasE4(){      //@ HABILITAR CUATRO DIAS DE ACTIVIDAD EXTRACURRICULAR
        rdioHoraE1D1.setEnabled(true);
        rdioHoraE2D1.setEnabled(true);
        rdioHoraE3D1.setEnabled(true);
        cmbSlcnDiaE1.setEnabled(true);
        cmbSlcnHoraInED1.setEnabled(true);
        cmbSlcnHoraFiED1.setEnabled(true);
        
        rdioHoraE1D2.setEnabled(true);
        rdioHoraE2D2.setEnabled(true);
        rdioHoraE3D2.setEnabled(true);
        cmbSlcnDiaE2.setEnabled(true);
        cmbSlcnHoraInED2.setEnabled(true);
        cmbSlcnHoraFiED2.setEnabled(true);
        
        rdioHoraE1D3.setEnabled(true);
        rdioHoraE2D3.setEnabled(true);
        rdioHoraE3D3.setEnabled(true);
        cmbSlcnDiaE3.setEnabled(true);
        cmbSlcnHoraInED3.setEnabled(true);
        cmbSlcnHoraFiED3.setEnabled(true);
        
        rdioHoraE1D4.setEnabled(true);
        rdioHoraE2D4.setEnabled(true);
        rdioHoraE3D4.setEnabled(true);
        cmbSlcnDiaE4.setEnabled(true);
        cmbSlcnHoraInED4.setEnabled(true);
        cmbSlcnHoraFiED4.setEnabled(true);
        
        rdioHoraE1D5.setEnabled(false);
        rdioHoraE2D5.setEnabled(false);
        rdioHoraE3D5.setEnabled(false);
        cmbSlcnDiaE5.setEnabled(false);
        cmbSlcnHoraInED5.setEnabled(false);
        cmbSlcnHoraFiED5.setEnabled(false);
        
        }
        
          public void habilitarDiasE5(){      //@ HABILITAR CINCO DIAS DE ACTIVIDAD EXTRACURRICULAR
        rdioHoraE1D1.setEnabled(true);
        rdioHoraE2D1.setEnabled(true);
        rdioHoraE3D1.setEnabled(true);
        cmbSlcnDiaE1.setEnabled(true);
        cmbSlcnHoraInED1.setEnabled(true);
        cmbSlcnHoraFiED1.setEnabled(true);
        
        rdioHoraE1D2.setEnabled(true);
        rdioHoraE2D2.setEnabled(true);
        rdioHoraE3D2.setEnabled(true);
        cmbSlcnDiaE2.setEnabled(true);
        cmbSlcnHoraInED2.setEnabled(true);
        cmbSlcnHoraFiED2.setEnabled(true);
        
        rdioHoraE1D3.setEnabled(true);
        rdioHoraE2D3.setEnabled(true);
        rdioHoraE3D3.setEnabled(true);
        cmbSlcnDiaE3.setEnabled(true);
        cmbSlcnHoraInED3.setEnabled(true);
        cmbSlcnHoraFiED3.setEnabled(true);
        
        rdioHoraE1D4.setEnabled(true);
        rdioHoraE2D4.setEnabled(true);
        rdioHoraE3D4.setEnabled(true);
        cmbSlcnDiaE4.setEnabled(true);
        cmbSlcnHoraInED4.setEnabled(true);
        cmbSlcnHoraFiED4.setEnabled(true);
        
        rdioHoraE1D5.setEnabled(true);
        rdioHoraE2D5.setEnabled(true);
        rdioHoraE3D5.setEnabled(true);
        cmbSlcnDiaE5.setEnabled(true);
        cmbSlcnHoraInED5.setEnabled(true);
        cmbSlcnHoraFiED5.setEnabled(true);
        
          }
    
    public void agregarMateria(Materia M, JComboBox cmbSlcnCarrera, JComboBox cmbSlcnSemestre, JTextField txtProfe, JTextField txtNRC, JTextField txtMateria, JComboBox cmbSlcnDia, JComboBox cmbSlcnDia2, JComboBox cmbSlcnDia4, JComboBox cmbSlcnHoraInD1, JComboBox cmbSlcnHoraFiD1, JComboBox cmbSlcnHoraInD3, JComboBox cmbSlcnHoraFiD3, JComboBox cmbSlcnHoraInD5, JComboBox cmbSlcnHoraFiD5, JRadioButton btnDias1, JRadioButton btnDias2, JRadioButton btnDias3){
        M = new Materia();
            M.setCarrera(cmbSlcnCarrera.getSelectedItem().toString());
            M.setSemestre(cmbSlcnSemestre.getSelectedItem().toString());
            M.setProfesor(txtProfe.getText());
            M.setMateria(txtMateria.getText());
            M.setNrc(Integer.parseInt(txtNRC.getText()));
            
        if(btnDias3.isSelected()==true){    
            M.setDia1(cmbSlcnDia.getSelectedItem().toString());
            M.setHoraI1(cmbSlcnHoraInD1.getSelectedItem().toString());
            M.setHoraF1(cmbSlcnHoraFiD1.getSelectedItem().toString());
            
            M.setDia2(cmbSlcnDia2.getSelectedItem().toString());
            M.setHoraI2(cmbSlcnHoraInD3.getSelectedItem().toString());
            M.setHoraF2(cmbSlcnHoraFiD3.getSelectedItem().toString());
            
            M.setDia3(cmbSlcnDia4.getSelectedItem().toString());
            M.setHoraI3(cmbSlcnHoraInD5.getSelectedItem().toString());
            M.setHoraF3(cmbSlcnHoraFiD5.getSelectedItem().toString());
           } 
        else if(btnDias2.isSelected()==true){
            M.setDia1(cmbSlcnDia.getSelectedItem().toString());
            M.setHoraI1(cmbSlcnHoraInD1.getSelectedItem().toString());
            M.setHoraF1(cmbSlcnHoraFiD1.getSelectedItem().toString());
            
            M.setDia2(cmbSlcnDia2.getSelectedItem().toString());
            M.setHoraI2(cmbSlcnHoraInD3.getSelectedItem().toString());
            M.setHoraF2(cmbSlcnHoraFiD3.getSelectedItem().toString());
            
            M.setDia3("X");
            M.setHoraI3("X");
            M.setHoraF3("X");
        }
        else if(btnDias1.isSelected()==true){
            M.setDia1(cmbSlcnDia.getSelectedItem().toString());
            M.setHoraI1(cmbSlcnHoraInD1.getSelectedItem().toString());
            M.setHoraF1(cmbSlcnHoraFiD1.getSelectedItem().toString());
            
            M.setDia2("X");
            M.setHoraI2("X");
            M.setHoraF2("X");
            
            M.setDia3("X");
            M.setHoraI3("X");
            M.setHoraF3("X");
        }
            XML.agregarMateriaXML(M);
    }
    
        public void agregarActividadE(Actividad A, JTextField txtAEx, JTextField txtNroAct,JComboBox cmbSlcnDiasE1, JComboBox cmbSlcnDiasE2, JComboBox cmbSlcnDiasE3,JComboBox cmbSlcnDiasE4,JComboBox cmbSlcnDiasE5, JComboBox cmbSlcnHoraInED1, JComboBox cmbSlcnHoraFiED1, JComboBox cmbSlcnHoraInED2, JComboBox cmbSlcnHoraFiED2, JComboBox cmbSlcnHoraInED3, JComboBox cmbSlcnHoraFiED3,JComboBox cmbSlcnHoraInED4, JComboBox cmbSlcnHoraFiED4,JComboBox cmbSlcnHoraInED5, JComboBox cmbSlcnHoraFiED5 ,JRadioButton btnDiasE1, JRadioButton btnDiasE2, JRadioButton btnDiasE3,JRadioButton btnDiasE4,JRadioButton btnDiasE5){
        A = new Actividad();
            A.setNombreAExtra(txtAEx.getText());
            A.setNroActividadE(Integer.parseInt(txtNroAct.getText()));   
            
        if(btnDiasE5.isSelected()==true){    
            A.setDiaE1(cmbSlcnDiasE1.getSelectedItem().toString());
            A.setHoraIE1((cmbSlcnHoraInED1.getSelectedItem().toString()));
            A.setHoraFE1((cmbSlcnHoraFiED1.getSelectedItem().toString()));
            
            A.setDiaE2(cmbSlcnDiasE2.getSelectedItem().toString());
            A.setHoraIE2((cmbSlcnHoraInED2.getSelectedItem().toString()));
            A.setHoraFE2((cmbSlcnHoraFiED2.getSelectedItem().toString()));
            
            A.setDiaE3(cmbSlcnDiasE3.getSelectedItem().toString());
            A.setHoraIE3((cmbSlcnHoraInED3.getSelectedItem().toString()));
            A.setHoraFE3((cmbSlcnHoraFiED3.getSelectedItem().toString()));
           
            A.setDiaE4(cmbSlcnDiasE4.getSelectedItem().toString());
            A.setHoraIE4((cmbSlcnHoraInED4.getSelectedItem().toString()));
            A.setHoraFE4((cmbSlcnHoraFiED4.getSelectedItem().toString()));
            
            A.setDiaE5(cmbSlcnDiasE5.getSelectedItem().toString());
            A.setHoraIE5((cmbSlcnHoraInED5.getSelectedItem().toString()));
            A.setHoraFE5((cmbSlcnHoraFiED5.getSelectedItem().toString()));
           } 
        else if(btnDiasE4.isSelected()==true){  
            A.setDiaE1(cmbSlcnDiasE1.getSelectedItem().toString());
            A.setHoraIE1((cmbSlcnHoraInED1.getSelectedItem().toString()));
            A.setHoraFE1((cmbSlcnHoraFiED1.getSelectedItem().toString()));
            
            A.setDiaE2(cmbSlcnDiasE2.getSelectedItem().toString());
            A.setHoraIE2((cmbSlcnHoraInED2.getSelectedItem().toString()));
            A.setHoraFE2((cmbSlcnHoraFiED2.getSelectedItem().toString()));
            
            A.setDiaE3(cmbSlcnDiasE3.getSelectedItem().toString());
            A.setHoraIE3((cmbSlcnHoraInED3.getSelectedItem().toString()));
            A.setHoraFE3((cmbSlcnHoraFiED3.getSelectedItem().toString()));
           
            A.setDiaE4(cmbSlcnDiasE4.getSelectedItem().toString());
            A.setHoraIE4((cmbSlcnHoraInED4.getSelectedItem().toString()));
            A.setHoraFE4((cmbSlcnHoraFiED4.getSelectedItem().toString()));
            
            A.setDiaE5("X");
            A.setHoraIE5("X");
            A.setHoraFE5("X");
           } 
         else if(btnDiasE3.isSelected()==true){  
            A.setDiaE1(cmbSlcnDiasE1.getSelectedItem().toString());
            A.setHoraIE1((cmbSlcnHoraInED1.getSelectedItem().toString()));
            A.setHoraFE1((cmbSlcnHoraFiED1.getSelectedItem().toString()));
            
            A.setDiaE2(cmbSlcnDiasE2.getSelectedItem().toString());
            A.setHoraIE2((cmbSlcnHoraInED2.getSelectedItem().toString()));
            A.setHoraFE2((cmbSlcnHoraFiED2.getSelectedItem().toString()));
            
            A.setDiaE3(cmbSlcnDiasE3.getSelectedItem().toString());
            A.setHoraIE3((cmbSlcnHoraInED3.getSelectedItem().toString()));
            A.setHoraFE3((cmbSlcnHoraFiED3.getSelectedItem().toString()));
           
            A.setDiaE4("X");
            A.setHoraIE4("X");
            A.setHoraFE4("X");
            
            A.setDiaE5("X");
            A.setHoraIE5("X");
            A.setHoraFE5("X");
           }
        else if(btnDiasE2.isSelected()==true){  
            A.setDiaE1(cmbSlcnDiasE1.getSelectedItem().toString());
            A.setHoraIE1((cmbSlcnHoraInED1.getSelectedItem().toString()));
            A.setHoraFE1((cmbSlcnHoraFiED1.getSelectedItem().toString()));
            
            A.setDiaE2(cmbSlcnDiasE2.getSelectedItem().toString());
            A.setHoraIE2((cmbSlcnHoraInED2.getSelectedItem().toString()));
            A.setHoraFE2((cmbSlcnHoraFiED2.getSelectedItem().toString()));
            
            A.setDiaE3("X");
            A.setHoraIE3("X");
            A.setHoraFE3("X");
           
            A.setDiaE4("X");
            A.setHoraIE4("X");
            A.setHoraFE4("X");
            
            A.setDiaE5("X");
            A.setHoraIE5("X");
            A.setHoraFE5("X");
           }
        else if(btnDiasE1.isSelected()==true){  
            A.setDiaE1(cmbSlcnDiasE1.getSelectedItem().toString());
            A.setHoraIE1((cmbSlcnHoraInED1.getSelectedItem().toString()));
            A.setHoraFE1((cmbSlcnHoraFiED1.getSelectedItem().toString()));
            
            A.setDiaE2("X");
            A.setHoraIE2("X");
            A.setHoraFE2("X");
            
            A.setDiaE3("X");
            A.setHoraIE3("X");
            A.setHoraFE3("X");
           
            A.setDiaE4("X");
            A.setHoraIE4("X");
            A.setHoraFE4("X");
            
            A.setDiaE5("X");
            A.setHoraIE5("X");
            A.setHoraFE5("X");
           }
            XMLAE.agregarActividadXMLE(A);
    }
 
  public void agregarModificacion(controlXMLAE XMLAE ,JTextField txtAExtra,JTextField txtNroActividad,JComboBox cmbSlcnDiaE1,JComboBox cmbSlcnDiaE2,JComboBox cmbSlcnDiaE3,JComboBox cmbSlcnDiaE4,JComboBox cmbSlcnDiaE5,JComboBox cmbSlcnHoraFiE1,JComboBox cmbSlcnHoraFiE2,JComboBox cmbSlcnHoraFiE3,JComboBox cmbSlcnHoraFiE4,JComboBox cmbSlcnHoraFiE5,JComboBox cmbSlcnHoraInE1,JComboBox cmbSlcnHoraInE2,JComboBox cmbSlcnHoraInE3,JComboBox cmbSlcnHoraInE4,JComboBox cmbSlcnHoraInE5,JRadioButton btnDiasE1, JRadioButton btnDiasE2, JRadioButton btnDiasE3,JRadioButton btnDiasE4,JRadioButton btnDiasE5){
     
   Actividad Act = XMLAE.buscarActividad(Integer.parseInt(txtNroActividad.getText()));
             Act.setNombreAExtra(txtAExtra.getText());
                 
            if(btnDiasE5.isSelected()==true){    
            Act.setDiaE1(cmbSlcnDiaE1.getSelectedItem().toString());
            Act.setHoraIE1((cmbSlcnHoraInE1.getSelectedItem().toString()));
            Act.setHoraFE1((cmbSlcnHoraFiE1.getSelectedItem().toString()));
            
            Act.setDiaE2(cmbSlcnDiaE2.getSelectedItem().toString());
            Act.setHoraIE2((cmbSlcnHoraInE2.getSelectedItem().toString()));
            Act.setHoraFE2((cmbSlcnHoraFiE2.getSelectedItem().toString()));
            
            Act.setDiaE3(cmbSlcnDiaE3.getSelectedItem().toString());
            Act.setHoraIE3((cmbSlcnHoraInE3.getSelectedItem().toString()));
            Act.setHoraFE3((cmbSlcnHoraFiE3.getSelectedItem().toString()));
           
            Act.setDiaE4(cmbSlcnDiaE4.getSelectedItem().toString());
            Act.setHoraIE4((cmbSlcnHoraInE4.getSelectedItem().toString()));
            Act.setHoraFE4((cmbSlcnHoraFiE4.getSelectedItem().toString()));
            
            Act.setDiaE5(cmbSlcnDiaE5.getSelectedItem().toString());
            Act.setHoraIE5((cmbSlcnHoraInE5.getSelectedItem().toString()));
            Act.setHoraFE5((cmbSlcnHoraFiE5.getSelectedItem().toString()));
           } 
        else if(btnDiasE4.isSelected()==true){  
            Act.setDiaE1(cmbSlcnDiaE1.getSelectedItem().toString());
            Act.setHoraIE1((cmbSlcnHoraInE1.getSelectedItem().toString()));
            Act.setHoraFE1((cmbSlcnHoraFiE1.getSelectedItem().toString()));
            
            Act.setDiaE2(cmbSlcnDiaE2.getSelectedItem().toString());
            Act.setHoraIE2((cmbSlcnHoraInE2.getSelectedItem().toString()));
            Act.setHoraFE2((cmbSlcnHoraFiE2.getSelectedItem().toString()));
            
            Act.setDiaE3(cmbSlcnDiaE3.getSelectedItem().toString());
            Act.setHoraIE3((cmbSlcnHoraInE3.getSelectedItem().toString()));
            Act.setHoraFE3((cmbSlcnHoraFiE3.getSelectedItem().toString()));
           
            Act.setDiaE4(cmbSlcnDiaE4.getSelectedItem().toString());
            Act.setHoraIE4((cmbSlcnHoraInE4.getSelectedItem().toString()));
            Act.setHoraFE4((cmbSlcnHoraFiE4.getSelectedItem().toString()));
            
            Act.setDiaE5("X");
            Act.setHoraIE5("X");
            Act.setHoraFE5("X");
           } 
         else if(btnDiasE3.isSelected()==true){  
            Act.setDiaE1(cmbSlcnDiaE1.getSelectedItem().toString());
            Act.setHoraIE1((cmbSlcnHoraInE1.getSelectedItem().toString()));
            Act.setHoraFE1((cmbSlcnHoraFiE1.getSelectedItem().toString()));
            
            Act.setDiaE2(cmbSlcnDiaE2.getSelectedItem().toString());
            Act.setHoraIE2((cmbSlcnHoraInE2.getSelectedItem().toString()));
            Act.setHoraFE2((cmbSlcnHoraFiE2.getSelectedItem().toString()));
            
            Act.setDiaE3(cmbSlcnDiaE3.getSelectedItem().toString());
            Act.setHoraIE3((cmbSlcnHoraInE3.getSelectedItem().toString()));
            Act.setHoraFE3((cmbSlcnHoraFiE3.getSelectedItem().toString()));
           
            Act.setDiaE4("X");
            Act.setHoraIE4("X");
            Act.setHoraFE4("X");
            
            Act.setDiaE5("X");
            Act.setHoraIE5("X");
            Act.setHoraFE5("X");
           }
        else if(btnDiasE2.isSelected()==true){  
            Act.setDiaE1(cmbSlcnDiaE1.getSelectedItem().toString());
            Act.setHoraIE1((cmbSlcnHoraInE1.getSelectedItem().toString()));
            Act.setHoraFE1((cmbSlcnHoraFiE1.getSelectedItem().toString()));
            
            Act.setDiaE2(cmbSlcnDiaE2.getSelectedItem().toString());
            Act.setHoraIE2((cmbSlcnHoraInE2.getSelectedItem().toString()));
            Act.setHoraFE2((cmbSlcnHoraFiE2.getSelectedItem().toString()));
            
            Act.setDiaE3("X");
            Act.setHoraIE3("X");
            Act.setHoraFE3("X");
           
            Act.setDiaE4("X");
            Act.setHoraIE4("X");
            Act.setHoraFE4("X");
            
            Act.setDiaE5("X");
            Act.setHoraIE5("X");
            Act.setHoraFE5("X");
           }
        else if(btnDiasE1.isSelected()==true){  
            Act.setDiaE1(cmbSlcnDiaE1.getSelectedItem().toString());
            Act.setHoraIE1((cmbSlcnHoraInE1.getSelectedItem().toString()));
            Act.setHoraFE1((cmbSlcnHoraFiE1.getSelectedItem().toString()));
           
            Act.setDiaE2("X");
            Act.setHoraIE2("X");
            Act.setHoraFE2("X");
            
            Act.setDiaE3("X");
            Act.setHoraIE3("X");
            Act.setHoraFE3("X");
           
            Act.setDiaE4("X");
            Act.setHoraIE4("X");
            Act.setHoraFE4("X");
            
            Act.setDiaE5("X");
            Act.setHoraIE5("X");
            Act.setHoraFE5("X");
           }
         XMLAE.actualizarActividad(Act);    
    }
         
    public  int validarVacio(JTextField txtNroAct, String mensaje){
       if (txtNroAct.getText().isEmpty())
          { JOptionPane.showMessageDialog(null, mensaje, "Error falta ingresar datos", JOptionPane.ERROR_MESSAGE); 
            return 0; 
          }
       else
            return 1;
   }  
    public int validarGrupo(JRadioButton rdioDiaE1,JRadioButton rdioDiaE2,JRadioButton rdioDiaE3,JRadioButton rdioDiaE4,JRadioButton rdioDiaE5, String mensaje){
      if(rdioDiaE1.isSelected()== false && rdioDiaE2.isSelected()== false && rdioDiaE3.isSelected()== false && rdioDiaE4.isSelected()== false && rdioDiaE4.isSelected()== false){
       JOptionPane.showMessageDialog(null, mensaje, "Error falta ingresar datos", JOptionPane.ERROR_MESSAGE);
       return 0;
      }
      else{  
      return 1; 
      }
    }

 public int validarNumero(String numero, String mensaje){
   try{
        int numero1 = Integer.parseInt(numero);
         return 1; 
      }
   catch(NumberFormatException ex){
      JOptionPane.showMessageDialog(null,mensaje,"Debe indicar un numero entero", JOptionPane.ERROR_MESSAGE);
      return 0;
       }
}     

   public void traerDatos(Actividad Act, JTextField txtAExtra, JComboBox cmbSlcnDiaE1,JComboBox cmbSlcnDiaE2,JComboBox cmbSlcnDiaE3,JComboBox cmbSlcnDiaE4,JComboBox cmbSlcnDiaE5,JComboBox cmbSlcnHoraFiED1,JComboBox cmbSlcnHoraFiED2,JComboBox cmbSlcnHoraFiED3,JComboBox cmbSlcnHoraFiED4,JComboBox cmbSlcnHoraFiED5,JComboBox cmbSlcnHoraInED1,JComboBox cmbSlcnHoraInED2,JComboBox cmbSlcnHoraInED3,JComboBox cmbSlcnHoraInED4,JComboBox cmbSlcnHoraInED5){
    txtAExtra.setText(Act.getNombreAExtra()); 
 }
   
 public  void limpiar(JTextField txtAExtra,JTextField txtNroActE ) {
        txtAExtra.setText("");
        txtNroActE.setText("");
    } 
 
 public  void desbotones(boolean verdadFalso,rsbuttom.RSButtonMetro btnAgregarE,rsbuttom.RSButtonMetro btnEliminarE,rsbuttom.RSButtonMetro btnModificarE,rsbuttom.RSButtonMetro btnAModificacionE,JTextField txtNroActE)
     {  btnAgregarE.setEnabled(verdadFalso);
        btnEliminarE.setEnabled(verdadFalso);
        btnModificarE.setEnabled(verdadFalso);
        btnAModificacionE.setVisible(!verdadFalso);
        txtNroActE.setEnabled(verdadFalso);
    }
 
 public void botonAM(rsbuttom.RSButtonMetro btnAModificacionE){
 btnAModificacionE.setVisible(false);
 }
                             
 }

        

