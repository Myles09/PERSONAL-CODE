
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author WINDOWS 10
 */
public class database {
    
    public static Connection connectDB(){
        
        try{
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/healths","root", ""); 
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
