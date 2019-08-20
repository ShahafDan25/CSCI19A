  
import java.sql.*;
import java.util.ArrayList;
/**Honors Project
   Shahaf Dan*/
public class Database
{

    public Connection getCon() throws Exception
    {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
        return conn;
    }
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
               System.out.println(rs.getString("studentID")); 
               System.out.println(rs.getString("firstName"));
               System.out.println(rs.getString("lastName"));
               System.out.println(rs.getString("major"));
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
    public ArrayList<String> showNames() throws Exception //return an arraylist (vector in c++)
    {
        Connection conn = null;
        //int numStudents = 0;
        String fn;
        String ln;
        ArrayList<String> students = new ArrayList <String>();
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost/test1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
            
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery("SELECT  COUNT (firstName) FROM test1");
            
            while(rs.next())
           {     
               
               fn = rs.getString("firstName");
               ln = rs.getString("lastName");
              
                students.add(fn+ln);
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

        return students;
    }
    public void insertStudent(int id, String f, String l, String major) throws Exception
    {
       // Class.forName("com.mysql.cj.jbdc.Driver");
        Connection c = this.getCon();
        Statement st = c.createStatement();
       
        //insert the data
        String sql = "INSERT INTO test1 (studentID, firstName, lastName, major) VALUES (" + id  + ", '" + f + "', '" + l + "', '" + major + "')";
        st.executeUpdate(sql);
    }
    public void removeStudent(int id) throws Exception
    {   
        //connect to database and create statement quo
        Connection c = this.getCon();
        Statement st = c.createStatement();
        
        //delete the data
        String sql = "DELETE FROM test1 WHERE studentID = '" + id + "'";
        st.executeUpdate(sql);
    }
    public boolean findStudent(String name, int id) throws Exception
    {
        Connection c = this.getCon();
        Statement st = c.createStatement();
        
        //check for existence
        String sql = "SELECT studentID FROM test1 WHERE firstName = '" + name + "'";
        ResultSet rs = st.executeQuery(sql);
        String validationID = "";
        while(rs.next())
        {
           validationID = rs.getString("studentID");
        }   
        
        System.out.println("passed name: " + name + "\n passed id: " + id);
        System.out.println("validation id: " + validationID);
        if(Integer.parseInt(validationID) == id)
        {
            System.out.println("same id");
            return true;
            
        }
        
        return false;
    }

    public String getMajor(int pid) throws Exception
    {
        Connection c = this.getCon();
        Statement st = c.createStatement();
        String sql = "SELECT major FROM test1 WHERE studentID = " + pid;
        ResultSet rs = st.executeQuery(sql);
        String rm = ""; // rm stands for returned major
        while(rs.next())
        {
          rm = rs.getString("major");

        }
        System.out.println(rm);
        return rm;
    }
    public ArrayList<String> getMajors() throws Exception
    {
        Connection c = this.getCon();
        Statement st = c.createStatement();
        String sql = "SELECT DISTINCT major FROM test1";
        ResultSet rs = st.executeQuery(sql);
        String rm = "";
        ArrayList<String> majors = new ArrayList<String>();
        while(rs.next())
        {
            rm = rs.getString("major");
            majors.add(rm);
        }
        return majors;
    }
    public ArrayList<String> getStudentsWithMajor(String major) throws Exception
    {
        ArrayList<String> students = new ArrayList<String>();
        Connection c = this.getCon();
        Statement st = c.createStatement();
        String sql = "SELECT firstName, lastName FROM test1 WHERE major = '" + major + "'";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            students.add(rs.getString("major"));
        }
        return students;
    }
}
