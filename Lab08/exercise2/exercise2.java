

/**Student: Shahaf Dan*/
public class exercise2
{
    public static void main(String[] args)
    {
        java.util.Date date = new java.util.Date(); //creatign a date object
        
        //displat the date and time for elapsedtime 10000,100000,....
        System.out.println("The dates and times for elapsed time in increments of *10");
        System.out.println("The times are measuredin miliseconds, and starts at 10000, which is equivalent to 10 seconds");
        for(long i = 10000; i < 1e11; i *=10)
        {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }   
}
