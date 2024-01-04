/**
 *
 * @author Rony Cedeño, David Cepeda, Mateo Criollo, Sebastian Criollo, INTER BYTE, DCCO-ESPE
 */
package ec.edu.espe.foodandrollorder.model;

import ec.edu.espe.foodandrollorder.model.Menu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class RestaurantChef extends User {

    private String chefName;
    private String email;
    private Menu menuOfRestaurant;

    public RestaurantChef(String chefName, String email, String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.chefName = chefName;
        this.email = email;
        this.menuOfRestaurant = new Menu();
    }

    public RestaurantChef(String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.menuOfRestaurant = new Menu();
    }

    public String toCSVChef() {
        return String.format("%s,%s,%s,%s,%s,%s", getChefName(), getEmail(), getUserId(), getPassword(), getLoginStatus(), getRegisterDate());
    }

    public boolean validateLoginForChef(String enteredUserId, String enteredPassword) {
        return getUserId().equals(enteredUserId) && getPassword().equals(enteredPassword);
    }

    public static ArrayList<RestaurantChef> readChefFromCSV(String csvFileName) {
        ArrayList<RestaurantChef> chefs = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String chefName = data[0];
                String email = data[1];
                String userId = data[2];
                String password = data[3];
                String loginStatus = data[4];
                Date registerDate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(data[5]);

                RestaurantChef chef = new RestaurantChef(chefName, email, userId, password, loginStatus, registerDate);
                chefs.add(chef);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return chefs;
    }

    @Override
    public String toString() {
        return "RestaurantChef{" + "chefName=" + chefName + ", email=" + email + '}';
    }

    public Menu checkPendingOrders() {
        // Implementar la lógica según sea necesario
        return new Menu();
    }

    public String getChefName() {
        return chefName;
    }

    public String getEmail() {
        return email;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}