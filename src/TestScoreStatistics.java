import java.io.IOException;
import java.util.Scanner;

public class TestScoreStatistics {


     public static void main(String[] args) throws IOException
     {
         try
         {

             Scanner keyboard = new Scanner(System.in);

             System.out.print( "Please enter number of tests: " );
             int numOfTests = keyboard.nextInt();
             double sumOfAllGrades = 0;//the sumOfAllGrades

             for( int i=0; i < numOfTests; i++ )

             {

                 System.out.print( "Enter the grade for Test " +(i+1)+ ": " );
                 double grade = keyboard.nextDouble();

                 sumOfAllGrades += grade;
             }

             double average = sumOfAllGrades/numOfTests;
             System.out.println("The average is: " + average);

         }

         catch( Exception e )
         {
             e.printStackTrace();
         }

     }
 }


