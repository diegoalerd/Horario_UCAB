/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import clases.Actividad;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
/**
 *
 * @author Diego
 */
public class ListCellRenderer2 extends DefaultListCellRenderer{
         public Component getListCellRendererComponent(
        JList list, Object value, int index,
        boolean isSelected, boolean cellHasFocus)
    {
        super.getListCellRendererComponent(list, value,
            index, isSelected, cellHasFocus);

        Actividad actividad = (Actividad)value;
        setText(actividad.getNombreAExtra() + "  ||  Numero de Actividad: " + actividad.getNroActividadE());
        return this;
    }   
}

