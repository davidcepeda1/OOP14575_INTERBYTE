
package ec.edu.espe.foodandrollorder.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class DataBaseCustomer {

    private static final String URI = "mongodb+srv://gabriel2004mat:1234@cluster0.dsm2nfg.mongodb.net/";
    private static final String DATABASE_NAME = "Far_DB";
    private static final String COLLECTION_NAME1 = "Customers";
    private static final String COLLECTION_NAME2 = "Orders";
    
    
    
    public static void observeDataBase(){
        System.out.println(URI);    
        System.out.println(DATABASE_NAME);
        System.out.println(COLLECTION_NAME1);
    }
    
    public static void showInformationDateBase(){
        MongoCollection<Document> collection = getCollection();
        if(collection!=null){
           
        }
        
    }
    
    
    public static void conectDataBase(){
        try {
            MongoClient mongoClient = MongoClients.create(URI);
            MongoDatabase dataBase = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection collection = dataBase.getCollection(COLLECTION_NAME1);
            
            System.out.println("Base de datos conectada");
            System.out.println(""+collection.getNamespace());
        } catch (MongoException e) {
            System.out.println("No se pudo conectar a la base de datos"+e);
        }
    }
    
    
    
    public static MongoCollection<Document> getCollection(){
        try {
            MongoClient mongoClient = MongoClients.create(URI);
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            
            return database.getCollection(COLLECTION_NAME1);
        } catch (MongoException | NoSuchMethodError e) {
            System.err.println(e.getCause());
            return null; 
        }
    }
    
    
    public static void saveCustomer(Object person){
        MongoCollection <Document> collection=getCollection();
        if(collection!=null){
            Gson gson = new GsonBuilder().create();
            String json=gson.toJson(person);
            Document personDocument = Document.parse(json);
            collection.insertOne(personDocument);
            System.out.println("Objeto registrado en la base de datos");
            
        }else{
            System.out.println("No se pudo insertar el objeto a la base de datos");
        }
    }
    
    public static void updateCustomer(String name, String addres){
        MongoCollection <Document> collection=getCollection();
        if(collection!=null){
            Document found =(Document) collection.find(new Document("customerName",name)).first();
            if(found!=null){
                Bson updateValue = new Document("addres",addres);
                Bson updateOperation = new Document("$set",updateValue);
                collection.updateOne(found, updateOperation);
                System.out.println("Cambio realizado");
            }
        }else{
            System.out.println("No se pudo acceder a la base de datos");
        }
    }
    
    public static void searchCustomer(String name){
        MongoCollection <Document> collection=getCollection();
        if(collection!=null){
            Document found =(Document) collection.find(new Document("customerName",name)).first();
            if(found!=null){
                System.out.println("Objeto encontrado");
                System.out.println(found.toJson());
            }else{
                System.out.println("Objeto no encontrado");
            }
        }else{
            System.out.println("No se pudo conectar a la base de datos");
        }
    }
    
    
    
    public static boolean confirmExistCustomer(String name){
        MongoCollection <Document> collection=getCollection();
        if(collection!=null){
            Document found =(Document) collection.find(new Document("customerName",name)).first();
            if(found!=null){
                System.out.println("Objeto encontrado");
                return true;
            }else{
                System.out.println("Objeto no encontrado");
                return false;
            }
        }else{
            System.out.println("No se pudo conectar a la base de datos");
            return false;
        }
    }
    
    public static void deleteCustomer(String name){
        MongoCollection <Document> collection=getCollection();
        if(collection!=null){
            Bson filtro = new Document("customerName", name);
            collection.deleteOne(filtro);
            System.out.println("Cliente eliminado correctamente.");
        }else{
            System.out.println("No se pudo conectar a la base de datos");
        }
    }
    
    public static void printAllCustomer(){
        MongoCollection <Document> collection=getCollection();
        if(collection!=null){
        collection.find().forEach(moc-> System.out.println(moc.toJson()));
        }else{
            System.out.println("No hay ningun elemento en la base de datos");
        }
    }
    
}
