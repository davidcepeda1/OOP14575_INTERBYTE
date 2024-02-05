
package utils;

import java.util.Random;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class SettingId {
    
    public static int establishIdPlate(){
        
        return new Random().nextInt(99999);
        
    }
}
