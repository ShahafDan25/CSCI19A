import java.util.*;

public class School
{
    String name;
    String location;
    int numCourses;
    ArrayList <Course> coursesOffered = new ArrayList <Course>();
    
    public static void main(String[] args)
    {
        
    }
    
    //setters and getters for school object
    public String getName()
    {
        return this.name;
    }
    public String getLocation()
    {
        return location;
    }
    public int numCourses()
    {
        return numCourses;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setLocation (String newLocation)
    {
        this.location = newLocation;
    }
    public void addCourse(Course newCourse)
    {
        coursesOffered.add(newCourse);
        numCourses++;
        System.out.println(newCourse.getCourseName() + " was added to the offered courses at " + this.name);
    }
    public void removeCourse(Course CourseTR)
    {
        boolean found = false;
        for(int i = 0; i < coursesOffered.size(); i++)
        {
            if(coursesOffered.get(i).getCourseName() == CourseTR.getCourseName())
            {
                found = true;
                
            }
            
        }
        if(found)
        {
            numCourses--;
            coursesOffered.remove(CourseTR);
            System.out.println(CourseTR.getCourseName() + "was removed from the courses offered at this school");
        }
        else
        {
            System.out.println("Course was not found in the list of courses in this school");
        }
        
    }
    
        
        
    
   
    
    
}
