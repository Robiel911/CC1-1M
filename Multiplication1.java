import java.util.Scanner;

public class Multiplication1 
{

     public static void main(String[] args)
     {
         Scanner in = new Scanner(System.in);
         int max;

         System.out.print("Enter Dimension? ");
         max = in.nextInt();

         drawline(max);

         for(int num = 1; num <= max; num++)
         {
          
             System.out.print("| ");
             for (int multiplier = 1; multiplier <=max; multiplier++)
             {
                  System.out.printf("%5d", num * multiplier);
                  System.out.print(" |");
             }
             drawline(max);
          }

      }

      public static void drawline(int max)
      {
          String line = "-------";
             /**
           * Draws a line across the page 
           */
          System.out.print("\n");
          for(int segments = 1; segments <= max; segments++)
          {
              System.out.print(line);
              if(segments ==max)
              {
                   System.out.print("--\n");
              }
          }
}
}