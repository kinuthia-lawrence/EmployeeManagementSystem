package employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    
    public static Connection connectDb(){
        
        try{
            
//            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system", "root", "");
            return connect;
        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return null;
    }
    
}
