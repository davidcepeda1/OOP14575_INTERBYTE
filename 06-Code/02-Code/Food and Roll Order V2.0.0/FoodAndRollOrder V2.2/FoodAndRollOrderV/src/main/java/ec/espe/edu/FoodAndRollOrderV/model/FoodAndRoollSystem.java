package ec.espe.edu.FoodAndRollOrderV.model;

import ec.espe.edu.FoodAndRollOrderV.view.FarRestaurantHome;
import ec.espe.edu.FoodAndRollOrderV.view.FrmSplash;

/**
 *
 * @author RC_558
 */
public class FoodAndRoollSystem {
    public static void main(String[] args) {
        FrmSplash frmSplash = new FrmSplash();
        FarRestaurantHome frmHome = new FarRestaurantHome();
        frmSplash.setVisible(true);
        frmSplash.setLocationRelativeTo(null);
        frmHome.setVisible(true);
        frmHome.setLocationRelativeTo(null);
    }
}
