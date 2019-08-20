import java.sql.*;

public class test1db
{
    
    /*"jdbc:mysql://localhost/test1"*/
    public static void main(String[] args) throws Exception
    {   
        Connection conn = null;
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost/test1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
          
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery("SELECT * FROM test1");
          
          while(rs.next())
          {     
               System.out.print(rs.getString("studentID")); 
               System.out.print(rs.getString("firstName"));
               System.out.print(rs.getString("lastName"));
               System.out.print(rs.getString("major"));
          }
        }
        
        catch(Exception e){
            e.printStackTrace(); 
        }
        
        finally{
            if(conn!=null)
            {
                conn.close();
            }
        }
    }
}