/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.ToolTipManager;
import paneles.JListTooltips;

/**
 *
 * @author LAB_L11
 */
    public class testjlist extends JFrame {
        
    public static void main(String args[]) {
        testjlist MyTest = new testjlist();
        MyTest.setTitle("Example JList");
        MyTest.setSize(300,300);
        MyTest.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JListTooltips list = new JListTooltips();
        DefaultListModel model = new DefaultListModel();      //crea la lista
        model.addElement("one");          //establece los elementos de la lista
        model.addElement("two");
        model.addElement("three");
        model.addElement("four");
        list.setModel(model);
        ToolTipManager.sharedInstance().registerComponent(list);
        MyTest.add(list);
        MyTest.setVisible(true);
    }
}
