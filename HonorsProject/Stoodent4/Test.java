import java.sql.*;
import java.util.*;

public class Test
{   
    public static void main(String[] args) throws Exception
    {
        System.out.println("Hello World");
        Test obj_Test = new Test();
        Connection connection = null;
        connection = obj_Test.getCon();
        System.out.println(connection);
        //System.out.println(this.getCon());
    }

    public Connection getCon() throws Exception
    {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "MMB3189@A");
            //Class.forName("com.mysql.cj.jdbc.Driver");
          //conn = DriverManager.getConnection("jdbc:mysql://localhost/test1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
            //jdbc:mysql://localhost/test1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return conn; // returns the connection to the db; 
    }
    
} 