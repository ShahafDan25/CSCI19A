import java.util.Scanner;

/**Student: Shahaf Dan */
public class exercise3
{
    public static void main()
    {
        System.out.println("Please enter a number, and we will reverse it");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        reverse(number);
    }
    
    public static void reverse(int number)
    {
        String sNum = Integer.toString(number);
        String reverse = "";
        for(int i = sNum.length()-1; i >=0; i--)
        {
            reverse += sNum.substring(i, i+1);
  
        }
        System.out.println("the reverse of " +  number + " is " + reverse);
    }
}
