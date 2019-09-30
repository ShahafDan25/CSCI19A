import java.util.Scanner;
/** Student: Shahaf Dan*/
public class WordLength
{
   public static void main(String[] args)
   {
       System.out.println("Please enter a word");
       Scanner input = new Scanner(System.in);
       String inputWord = input.next();
       
       System.out.println("The length of the word " + inputWord + " is: " + inputWord.length() + "characters");
       System.out.println("The first character of the word " + inputWord + " is:   " + inputWord.charAt(0));
   }
}
