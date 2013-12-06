
package view;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MessageBox {
    public static void show(Component parent, String message, String title) {
         JOptionPane.showMessageDialog(parent, message, title, 
                 JOptionPane.INFORMATION_MESSAGE);
    }
    public static void show_error(Component parent, String message, String title) {
         JOptionPane.showMessageDialog(parent, message, title, 
                 JOptionPane.ERROR_MESSAGE);
    }
}
