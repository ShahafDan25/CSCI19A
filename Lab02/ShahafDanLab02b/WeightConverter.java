import java.util.Scanner;
/**
 * Write a description of class WeightConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeightConverter
{
    public static void main()
    {
        System.out.println("Please Enter a number of pounds");
        Scanner input = new Scanner(System.in);
        String poundString = input.nextLine();
        double pounds = Double.parseDouble(poundString);
        double kgs = 0.454 * pounds;
        System.out.println("In " + pounds + " , there are " + kgs + " kliograms");
    }
    
}
