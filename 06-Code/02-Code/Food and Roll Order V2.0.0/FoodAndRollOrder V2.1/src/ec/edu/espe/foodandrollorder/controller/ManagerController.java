
package ec.edu.espe.foodandrollorder.controller;

import ec.edu.espe.foodandrollorder.utils.DataBase;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class ManagerController {
    private static String nameCollection = "Manager";
    
    public static boolean findManager(String username , String password){
        return DataBase.findManager(username, password, nameCollection);
    }
    
}
