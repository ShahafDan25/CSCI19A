import java.util.Scanner;
/**Student: Shahaf Dan
   Assignment: Lab 07 exercise 03*/
public class exercise3
{
    
    public static void main()
    {
        System.out.println("How many numbers would like to calculate the gcd of");
        Scanner input = new Scanner (System.in);
        final int size = input.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Now, enter " + size + " numbers for the values of the array");
        for(int i = 0; i < size; i++)
        {
            numbers[i] = input.nextInt();
           
        }
        System.out.println("The GCD of the numbers you have entered is: " + gcd(numbers));
    }
    
    public static int gcd(int... numbers)
    {
        int gcd = 1;
        int min = numbers[0];
        for (int j = 1; j < numbers.length; j++)
        {   
            if(numbers[j] < min)
            {
                min = numbers[j];
            }
        }
            
        int count = 0;
        for(int k = 2; k <= min; k++) // lowest common dividor can be 2// greatest can be the lowest value in the array
        {
            for( int i = 0; i < numbers.length; i++)
            {
                if(numbers[i] %k == 0)
                {
                    count++;
                    if(count == numbers.length - 1)
                    {
                        gcd = k;
                    }
                }
                else
                {
                    count = 0;
                }
            }
        }

        return gcd;
    }
}
