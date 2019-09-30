import java.util.*; //importing Arraylista dn Scanners at once

/**Lab 10 Computer Sciene Java
   Student: Shahaf Dan*/
public class exercise3
{
    public static void main(String[] args)
    {
        System.out.println("Please enter as many integers as you would like at any order, we will make sure to sort them");
        System.out.println("Enter a negative number to stop entering numbers");
        
        ArrayList <Integer> numbers = new ArrayList <Integer>();
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        while(answer >= 0)
        {
            numbers.add(answer);
            answer = input.nextInt();
        }
        sort(numbers);
        
    }
    public static void sort(ArrayList <Integer> list)
    {
        //use the built in functoin to sort an arraylist
        Collections.sort(list);
        
        //now print the arraylist to make sure
        for(int p = 0; p < list.size(); p++)
        {
            System.out.print(list.get(p) + ", " );
        }
    }
}
