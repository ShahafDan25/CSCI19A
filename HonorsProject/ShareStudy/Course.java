
import java.util.*;
public class Course
{
    int crn;
    String name;
    int numStudents;
    ArrayList<Student> students = new ArrayList <Student>();
    public static void main(String [] args)
    {
        
    }
    
    //getters and setters for this class
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setCrn(int newCrn)
    {
        this.crn = newCrn;
    }
    public void addStudent(Student newStudent)
    {
        this.numStudents ++;
        students.add(newStudent);
        System.out.println(newStudent.name + " was added as a new student");
    }
    public void removeStudent(Student newStudent)
    {
        // kinda long an pointsless, can be made to be more efficient.
        int studentRemovalIndex;
        boolean found = false;
        for(int i = 0; i <this.students.size(); i++)
        {
            if(this.students.get(i).name == newStudent.getName())
            {
                studentRemovalIndex = i;
                found = true;
            }
            
        }
        if(found)
        {
             this.numStudents--;
             students.remove(newStudent);
             System.out.println(newStudent.getName() + " was removed succesfully from the class");
        }
        else
        {
            System.out.println("the student was not found in the class");
            
        }
    }
    public String getCourseName()
    {
        return this.name;
    }
    public int getCrn()
    {
        return this.crn;
    }
    public int getNumberStudents()
    {
        return this.numStudents;
    }
        
}
