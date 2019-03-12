/**
 * @(#)Lab12.java
 *
 * Lab12 application
 *
 * @author
 * @version 1.00 2019/2/14
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Lab12
{

    public static void main(String[] args)
   {
      MagpieLab12a maggie = new MagpieLab12a();

      System.out.println (maggie.getGreeting());
      Scanner in = new Scanner (System.in);
      String statement = in.nextLine();

      while (!statement.equals("Bye"))
      {
         System.out.println (maggie.getResponse(statement));
         statement = in.nextLine();
      }
   }

}
