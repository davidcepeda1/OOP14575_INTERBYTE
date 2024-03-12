package ec.espe.edu.FoodAndRollOrderV.model;

import ec.espe.edu.FoodAndRollOrderV.view.FarRestaurantHome;
import ec.espe.edu.FoodAndRollOrderV.view.FrmSplashFarOrder;

public class FoodAndRoollSystem {
    public static void main(String[] args) {
       
       FrmSplashFarOrder frmSplash = new FrmSplashFarOrder();
       frmSplash.setVisible(true);
       frmSplash.setLocationRelativeTo(null);
        
        FarRestaurantHome frmHome = new FarRestaurantHome();
        frmHome.setVisible(true);
        frmHome.setLocationRelativeTo(null);
    }
}
