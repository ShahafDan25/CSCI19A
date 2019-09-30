
/**Student: Shahaf Dan*/
public class TestCircle2D
{
    public static void main(String[] args)
    {
        Circle2D test0 = new Circle2D();
        Circle2D test1 = new Circle2D(1,1,3);
        Circle2D test2 = new Circle2D(2,2,4);
        Circle2D test3 = new Circle2D(5,5,1);
        Circle2D[] cs = new Circle2D[]{test0, test1, test2, test3};
         System.out.println("Here are the circles in this examples:" );
        for(int i = 0; i < cs.length; i++)
        {
            System.out.println("Circle number " + i + " has a radius of " + cs[i].getRadius() + " and is centered at ( " + cs[i].getX() + ", " + cs[i].getY() + ")");
        }
        
       
        System.out.println("Area of circle 0 " + test0.getArea());
        System.out.println("Area of circle 1 " + test1.getArea());
        System.out.println("Perimeter of circle 2" + test2.getPerimeter());
        System.out.println("Peimeter of circle 1" + test3.getPerimeter());
        System.out.println("Does circle 0 contain the point (1, 2)  " + test0.contains(1,2));
        System.out.println("Does circle 2 contain the point (3, 4)  " + test2.contains(3,4));
        System.out.println("Does circle 1 contain circle 0?  " + test1.contains(test0));
        System.out.println("Does circle 3 contain circle 1?  " + test3.contains(test1));
        System.out.println("Does circle 2 overlap circle 3?  "+ test2.overlaps(test3));
        System.out.println("Does circle 2 overlap circle 0?  " + test2.overlaps(test0));
    }
}
