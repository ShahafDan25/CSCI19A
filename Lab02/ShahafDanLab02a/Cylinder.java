import java.util.Scanner; // importing the scanner library
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder
{
    // instance variables - replace the example below with your own
    public static void main(String[] a)
    {
        System.out.println("Enter the radius of the base of the cylinder");
        Scanner radiusInput = new Scanner(System.in);
        System.out.println("Thanks, Now, Enter the Clyinder's Length");
        Scanner lengthInput = new Scanner (System.in);
        String radiusString = radiusInput.nextLine();
        double radius = Double.parseDouble(radiusString);
        String lengthString = lengthInput.nextLine();
        double length = Double.parseDouble(lengthString);
        final double pi = 3.141;
        double area = radius * radius * pi;
        double volume = area * length;
        System.out.println("Cylinder's Radius: " + radius);
        System.out.println("Cylinder's Area: " + area);
        System.out.println("Cylinder's Volume: " + volume);
    }
}
