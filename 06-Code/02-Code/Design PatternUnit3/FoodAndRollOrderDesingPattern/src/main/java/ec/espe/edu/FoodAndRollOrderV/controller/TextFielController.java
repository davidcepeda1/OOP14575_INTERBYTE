
package ec.espe.edu.FoodAndRollOrderV.controller;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;


/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class TextFielController {
    
    public static boolean esCaracterValido(char caracter, JTextField textField) {
        return ((caracter<'0'||caracter>'9')
                &&(caracter!=KeyEvent.VK_SPACE)
                &&(caracter!='.'||textField.getText().contains(".")));
    }
    
    
    
}
