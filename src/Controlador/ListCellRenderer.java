/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import clases.*;
/**
 *
 * @author meggu
 */
public class ListCellRenderer extends DefaultListCellRenderer{
    public Component getListCellRendererComponent(
        JList list, Object value, int index,
        boolean isSelected, boolean cellHasFocus)
    {
        super.getListCellRendererComponent(list, value,
            index, isSelected, cellHasFocus);

        Materia materia = (Materia)value;
        setText(materia.getMateria() + "  ||  " + materia.getProfesor() + "  ||  NRC: " + materia.getNrc());
        return this;
    }
}    



