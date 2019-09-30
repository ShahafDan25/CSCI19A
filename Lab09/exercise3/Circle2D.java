
/**Student: Shahaf Dan
   Purpose: Lab09 Java Summer Computer Science Class*/
public class Circle2D
{
    double x; // make getter
    double y; //make getter
    double radius; 
    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public double getRadius(){return this.radius;}
    Circle2D() //default no - arg construtor
    {
        x = 0;
        y = 0;
        radius = 1;
    }
    Circle2D(double nx, double ny, double nr) // non default contructor
    {
        x = nx;
        y = ny;
        radius = nr;
    }
    public double getArea()
    {
        final double pi = 3.141;
        return (pi * radius * radius);
    }
    public double getPerimeter()
    {
        final double pi = 3.141;
        return (2 * radius * pi);
    }
    public boolean contains(double px, double py)
    {
        boolean isin = false;
        //calculate distance between points
        // if distance is less than radius, than the point is inside
        double dx = px - x;
        double dy = py - y;
        double distance = Math.sqrt(dy*dy + dx*dx);
         
        if(distance < radius)
        {
            isin = true;
        }
        return isin;
    }
    public boolean contains(Circle2D circle)
    {
        //check: if the distance between the two center points plus the radius of the inside circle are less than
        // the bigger circle's radius, than the circle is inside.
        double dy = y - circle.y;;
        double dx = x - circle.x;;
        double dist = Math.sqrt(dy*dy + dx*dx);
        double dtc = dist + circle.radius;
        if(dtc < radius)
        {
            return true;
        }
        
        return false;
    }
    public boolean overlaps(Circle2D circle)
    {
        //check if the specified distance is within the range;
        double dx = x - circle.x;
        double dy = y - circle.y;
        
        double dist = Math.sqrt(dy*dy + dx*dx);
        double dtc = dist + circle.radius;
        if(dtc > radius && dtc < (radius + circle.radius))
        {
            return true;
        }
        
        return false;
    }
}
