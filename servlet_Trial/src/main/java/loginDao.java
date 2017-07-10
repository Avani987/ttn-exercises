package main.java;
import javax.servlet.http.HttpSession;
import java.sql.*;

public class loginDao
{

    public static int checkUser(String username,String password)
    {
        int uid=0;
        connect c=new connect();
        try{
            PreparedStatement ps =c.con.prepareStatement("select * from login where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            if(rs.next()) {
                uid = rs.getInt("userId");
            }
            ps.close();
            rs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return uid;
    }
}
