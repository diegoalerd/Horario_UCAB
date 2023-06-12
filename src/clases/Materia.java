/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.ArrayList;

/**
 *
 * @author LAB_L11
 */
public class Materia {
    int nrc;
    String materia;
    String carrera;
    String semestre, profesor, dia1, dia2, dia3, horaI1, horaI2, horaI3, horaF1, horaF2, horaF3;
    ArrayList<Materia> listaMate = new ArrayList<Materia>();

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getDia1() {
        return dia1;
    }

    public void setDia1(String dia1) {
        this.dia1 = dia1;
    }

    public String getDia2() {
        return dia2;
    }

    public void setDia2(String dia2) {
        this.dia2 = dia2;
    }

    public String getDia3() {
        return dia3;
    }

    public void setDia3(String dia3) {
        this.dia3 = dia3;
    }

    public String getHoraI1() {
        return horaI1;
    }

    public void setHoraI1(String horaI1) {
        this.horaI1 = horaI1;
    }

    public String getHoraI2() {
        return horaI2;
    }

    public void setHoraI2(String horaI2) {
        this.horaI2 = horaI2;
    }

    public String getHoraI3() {
        return horaI3;
    }

    public void setHoraI3(String horaI3) {
        this.horaI3 = horaI3;
    }

    public String getHoraF1() {
        return horaF1;
    }

    public void setHoraF1(String horaF1) {
        this.horaF1 = horaF1;
    }

    public String getHoraF2() {
        return horaF2;
    }

    public void setHoraF2(String horaF2) {
        this.horaF2 = horaF2;
    }

    public String getHoraF3() {
        return horaF3;
    }

    public void setHoraF3(String horaF3) {
        this.horaF3 = horaF3;
    }

    public ArrayList<Materia> getListaMate() {
        return listaMate;
    }

    public void setListaMate(ArrayList<Materia> listaMate) {
        this.listaMate = listaMate;
    }

    public Materia(int nrc, String materia, String carrera, String semestre, String profesor, String dia1, String dia2, String dia3, String horaI1, String horaI2, String horaI3, String horaF1, String horaF2, String horaF3) {
        this.nrc = nrc;
        this.materia = materia;
        this.carrera = carrera;
        this.semestre = semestre;
        this.profesor = profesor;
        this.dia1 = dia1;
        this.dia2 = dia2;
        this.dia3 = dia3;
        this.horaI1 = horaI1;
        this.horaI2 = horaI2;
        this.horaI3 = horaI3;
        this.horaF1 = horaF1;
        this.horaF2 = horaF2;
        this.horaF3 = horaF3;
    }

  public Materia() {
    }


}
