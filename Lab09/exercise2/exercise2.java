import java.util.Scanner;
/**Student: Shahaf Dan*/
public class exercise2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

	
	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	int index = 2;  
		
	while (number / index != 1) {
		
		if (number % index  == 0)
		{
		    System.out.print(index + ", ");
		    number /= index; 
		}
		else
		    index++;
	}
	System.out.println(number + ".");
   }
}
