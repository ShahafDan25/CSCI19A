import java.util.Scanner;
import java.util.*;
/** Student: Shahaf Dan , Exercise 2*/
public class studentScore
{
    public static void main(String[] args)
    {
        System.out.println("Please, enter how many students you would like to review?");
        Scanner input = new Scanner(System.in);
        int numStudents = input.nextInt();
        ArrayList <String> names = new ArrayList <String>();
        ArrayList <Integer> scores = new ArrayList <Integer>();
        int newScore;
        String newName;
        int indexHighest = 0;
        
        for(int i = 0; i < numStudents; i++)
        {
            System.out.println("Please enter in one line the name of the studentand their score");
            Scanner input2 = new Scanner(System.in);
            newName = input2.next();
            newScore = input2.nextInt();
            scores.add(newScore);
            names.add(newName);
                
            if(newScore > scores.get(indexHighest))
            {
                indexHighest = i; // keeps track of the highest score index
            }
    
        }
        System.out.println("The student " + names.get(indexHighest) + 
        " has the highest score of " + scores.get(indexHighest)); 
        //prints results based on index

    }
}
