
package Bata;

import java.beans.Statement;
import java.sql.DriverManager;


public class Connection {
    
    
       private java.sql.Connection con;
    private Statement st;
     public Statement connection(){
        try{
            Class.forName("org.slite.JDBC");
            String url="jdbc:sqlite:temp.db";
            con=DriverManager.getConnection(url);
            st=(Statement) con.createStatement();
            System.out.println("Succesful");
            
            
        }
        
        catch(Exception ex){
              System.out.println("Connection failed");
        }
        return st;
    }
    
    
}
