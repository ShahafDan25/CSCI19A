import java.util.*;
/**Lab 10 Computer Science Java
   Student: Shahaf Dan*/
public class exercise2
{
    public static void main(String[] args)
    {
        int num1 = (int)(Math.random() * 1000) + 1;
        int num2 = (int)(Math.random() * 1000) + 1;
        System.out.println("What is the sum of the two random numbers?");
        System.out.println(num1 + " + " + num2 + " = ");
    
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        while(answer != (num1 + num2))
        {
            System.out.println("Sorry but your answer is incorrect, try again");
            answer = input.nextInt();
        }
        
        System.out.println("Congratulations, you answer is correct, thank you for playing");
        
    }
}
