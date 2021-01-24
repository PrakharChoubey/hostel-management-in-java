/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author pc
 */
public class ConnecProvider {

    public static Connection getCon() throws Exception{
        try{
             String url="jdbc:mysql://localhost:3306/hostel";
            String uname="root";
            String pass= "red4";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            return con;
            
        }
        catch(Exception e){
           return null;
        }
        
    }
}
