import java.util.Scanner;
/**  Student: Shahaf Dan */
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner edgeInput = new Scanner(System.in);
        System.out.println("Enter three different integers as the sides of a traingle");
        int side1, side2, side3;
        side1 = edgeInput.nextInt();
        side2 = edgeInput.nextInt();
        side3 = edgeInput.nextInt();
        
        boolean valid = false;
        while(!valid)
        {
            if(((side1 + side2) > side3) && ((side2 + side3) > side1) && ((side3 + side1) > side2)) //invalid input
            {
                int perimeter = side1 + side2 + side3;
                System.out.println("The permitere of the traingel is the sum of all edges: " + perimeter);
                valid = true;
                
            }
            else
            {
                System.out.println("Input is Invalid!");
                System.out.println("Try Again, enter sides of a triangle");
                side1 = edgeInput.nextInt();
                side2 = edgeInput.nextInt();
                side3 = edgeInput.nextInt();
            }
        }
        
    }
    
}
