  
 
import java.util.Scanner;
import java.util.ArrayList;
/**Admin Class*/


public class Admin
{
    public static Database db = new Database();
    Admin() {
    }
    
    public static void main(String[] args) throws Exception
    {
        System.out.println("What would you like to do?");
        int answer;
        System.out.println("0 - exit \n1 - inserting new students\n 2 - removing students\n 3 - review classroom\n 4 - review students with a specific major");
        Scanner input = new Scanner(System.in);
        answer = input.nextInt();
        while(answer != 0)
        {
            if(answer == 1)
            {
                insertingStudents();
            }
            else if(answer == 2)
            {
                removeStudent();
            }
            else if(answer ==3)
            {
                // call to review students function
            }
            else if(answer == 4)
            {
                System.out.println("Here are the majors in your classroom:");
                ArrayList<String> majorsInClass = new ArrayList<String>();
                majorsInClass = db.getMajors(); 
                System.out.println("Now, which major would you like to choose from the following majors?");
                for(int i = 0; i < majorsInClass.size(); i++)
                {
                    System.out.print(majorsInClass.get(i) + ", ");
                    
                }
                String major = input.next();
                getStudentsWithMajor(major);
            }
           System.out.println("0 - exit \n1 - inserting new students\n 2 - removing students\n 3 - review classroom");
           answer = input.nextInt(); 
        }
        input.close(); //closes the Scanner object called input

    }
    public static void insertingStudents() throws Exception
    {
        int id;
        String f;
        String l;
        String major;
        int answer = 1;
        Scanner info = new Scanner(System.in);

        while(answer != 0)
        {
            System.out.println("Enter the student's ID, first name, last name and major, separated by spaces");
            id = info.nextInt();
            f = info.next();
            l = info.next();
            major = info.next();
            db.insertStudent(id,f,l,major);
            System.out.println("Would you like to insert another student? (1 = yes / 0 = no)");
            answer = info.nextInt();

        }
        System.out.println("Thanks you");
        info.close();
    }
    public static void insertStudent(int id, String f, String l,String m) throws Exception
    {
        db.insertStudent(id,f,l,m);
    }
    public static void removeStudent() throws Exception
    {
        int id;
        int answer = 1;
        Scanner in = new Scanner(System.in);

        while(answer != 0)
        {
            System.out.println("Enter the ID of the student you would like to remove");
            id = in.nextInt();
            db.removeStudent(id);
            System.out.println("Would you like to remove another student? (1 = yes / 0 = no)");
            answer = in.nextInt();

        }
        System.out.println("Thank you");
        in.close();
    }
    public static boolean validateStudent(int pid, String pname) throws Exception
    {
        // System.out.println("Enter you name and is");
        // Scanner input = new Scanner(System.in);
        // String name = input.next();
        // int id = input.nextInt();

        boolean found = db.findStudent(pname, pid);
        if(found)
        {
            System.out.println("FOUND");
            return true;
            
        }
        else
        {
            System.out.println("SORRY");
        }
        return false;
    }

    public static String getMajor(int pid) throws Exception
    {
        System.out.println("Looking for the major of the student with the id: " + pid);
        String rm = db.getMajor(pid); //rm is returned major
        return rm;
    }
    public static void getStudentsWithMajor(String major) throws Exception
    {
        System.out.println("Looking for students with the major of " + major);
        ArrayList<String> studentsWith = new ArrayList<String>();
        studentsWith = db.getStudentsWithMajor(major); //rsl is returned student list
        for(int i = 0; i <studentsWith.size(); i++)
        {
            System.out.print(studentsWith.get(i) + ", ");
        }
    }
}
