package main.java;
import java.sql.Connection;
import java.sql.DriverManager;

public class connect{

    public Connection con;
    public connect(){

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "root");
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
