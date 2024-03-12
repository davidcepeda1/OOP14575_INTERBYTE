
package ec.espe.edu.FoodAndRollOrderV.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Manager extends User{

    private static Manager instanceManager;
    
    public Manager(String name, String cedula, String cellphoneNumber, String username, String password, Date startDate) {
        super(name, cedula, cellphoneNumber, username, password, startDate);
    }

    
    public synchronized static Manager getManager(String name, String cedula, String cellphoneNumber, String username, String password, Date startDate){
        if(instanceManager == null){
            instanceManager = new Manager(name, cedula, cellphoneNumber, username, password, startDate);
        }
        return instanceManager;
    } 
}
