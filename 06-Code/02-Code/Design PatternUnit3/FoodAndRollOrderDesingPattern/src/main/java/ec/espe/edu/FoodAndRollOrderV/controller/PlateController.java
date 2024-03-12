
package ec.espe.edu.FoodAndRollOrderV.controller;

import com.mongodb.client.MongoCollection;
import ec.espe.edu.FoodAndRollOrderV.model.Plate;
import org.bson.Document;
import utils.DataBase;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class PlateController {

    private static String nameCollection = "Plate";
    
    public static boolean createPlate(Plate plate){
        return DataBase.agreggratePlate(plate , nameCollection);
    }

    public static String getNameCollection() {
        return nameCollection;
    }
    
    
    
}
