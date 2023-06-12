/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import javax.swing.JList;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author LAB_L11
 */
public class JListTooltips extends JList{
    public JListTooltips(){
        super();
        addMouseMotionListener( new MouseMotionAdapter() {
            
        public void mouseMoved( MouseEvent e) {
            JListTooltips theList = (JListTooltips) e.getSource();
            ListModel model = theList.getModel();
            int index = theList.locationToIndex(e.getPoint());   //posicion del tooltip
            if (index > -1) {          //si no esta sobre ningun objeto de la lista
                theList.setToolTipText(null);
                String text = ("jjjjjjjj");    //que dice el tooltip
                model.getElementAt(index);
                theList.setToolTipText(text);
            }
        }
    });
    }

public String getToolTipText(MouseEvent e){
        return super.getToolTipText();
}
}

//public class testjlist extends JFrame {
//    public static void main(String args[]) {
//        testjlist MyTest = new testjlist();
//        MyTest.setTitle("Example JList");
//        MyTest.setSize(300,300);
//        MyTest.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        JListTooltips list = new JListTooltips();
//        DefaultListModel model = new DefaultListModel();
//        model.addElement("one");
//        model.addElement("two");
//        model.addElement("three");
//        model.addElement("four");
//        list.setModel(model);
//        ToolTipManager.sharedInstance().registerComponent(list);
//        MyTest.add(list);
//        MyTest.setVisible(true);
//    }
//}

    

