import java.sql.*;
import java.util.*;

/** Project Manager Java App Database Manager*/
public class DaBa
{
   
   public Connection getCon() throws Exception
   { 
       
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
        return conn;
    
   } 
}
