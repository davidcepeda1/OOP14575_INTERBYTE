
package ec.edu.espe.foodandrollorder.model;

/**
 *
 * @author Sebastian
 */
public class GrilledShrimp extends Plate{
    
    private boolean spicy;
    
    public GrilledShrimp(int id,String name,String description, double price,String availability,String preparationTime,boolean spicy){
        super(id,name,"Seafood",description,price,availability,preparationTime);
        this.spicy = spicy;
    }
    public void getDails(){
        super.getDetails();
        System.out.println("Spicy"+spicy);
    }
    
    public boolean isSpicy(){
        return spicy;
    }
    
    public void setSpicy(boolean spicy){
        this.spicy =spicy;
    }
}
