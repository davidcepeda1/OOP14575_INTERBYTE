
package ec.espe.edu.FoodAndRollOrderV.controller;

import ec.espe.edu.FoodAndRollOrderV.model.Manager;
import utils.DataBase;


/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class ManagerController {
    private static String nameCollection = "Manager";
    
    public static boolean findManager(String username , String password){
        return DataBase.findManager(username, password, nameCollection);
    }
    
    public static boolean createManager(Manager manager){
        return DataBase.createManager(manager, nameCollection);
    }
}
