/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.sql.*;
/**
 *
 * @author home
 */
public class SQL {
    public Connection getConnection()
    {
        Connection con=null;
                try{
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        }
        catch(ClassNotFoundException err){
            System.out.println(err);
        }
                
        try {
            con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","sys as sysdba","admin");
                    System.out.println("Success");
            return con;
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    public ResultSet selectQuery(PreparedStatement ps){
        
        try {

            ResultSet rs=ps.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println(e); 
        }
        ResultSet rs = null;
        return rs;
    }
}
