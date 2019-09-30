import java.util.Scanner;
/**Student: Shahaf Dan
   Assignment:  Lab 07 Exercise 02*/
public class exercise2
{
    public static void main()
    {
        System.out.println("Hello User, please enter a number which will be the amount of elements in the array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[] values = new double[size]; // dynamically allocating an array of type double
        System.out.println("Now enter as many values to the array");
        for(int i = 0 ; i < size; i++)
        {
            values[i] = input.nextDouble();
            
        }
        System.out.println("Thanks for the values, now we will tell you which one is the lowest value");
        System.out.println("The lowest value in your array is: " + min(values));
    }
    
    public static double min(double[] array)
    {
        double min = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
}
