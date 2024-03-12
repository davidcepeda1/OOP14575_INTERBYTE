
package ec.espe.edu.FoodAndRollOrderV.controller;

import ec.espe.edu.FoodAndRollOrderV.model.Plate;
import ec.espe.edu.FoodAndRollOrderV.model.Voucher;
import utils.DataBase;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class VoucherController {
    private static String nameCollection = "Voucher";
    
    
    public static boolean createOrder(Voucher voucher){
        return DataBase.createVoucher(voucher, nameCollection);
    }
}
