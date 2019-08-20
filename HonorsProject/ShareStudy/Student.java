import java.util.*; //importing the entire java.util library
import java.sql.*;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    String name; //name
    int id; // student ID
    ArrayList<Course> courses = new ArrayList <Course>();
    School school;
    
   
    // setter and getter for the name
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    
    //setter and getters for the id
    public int getID()
    {
        return this.id;
    }
    public void setID(int newID)
    {
        this.id = newID;
    }
    
    //setters and getters for school
    public String getSchool()
    {
        return this.school.getName();
    }
    public void setSchool(School newSchool)
    {
        this.school = newSchool;
    }
    
    
    //public arraylist functions
    public void removeCourse(Course newCourse)
    {
        boolean removed = false;
        for (int i = 0; i < this.courses.size(); i++)
        {
            if(courses.get(i).getCourseName() == newCourse.getCourseName())
            {
                removed = true;
            }
        }
        if(removed)
        {
            System.out.println("Course" + newCourse.getCourseName() + "has been removed");
        }
        else
        {
            System.out.println("Course" + newCourse.getCourseName() + "has been removed");
        }
    }
    public void addCourse(Course courseToAdd)
    {
        this.courses.add(courseToAdd);
    }
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to ShareStudy");
    }
        
}
