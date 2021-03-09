import java.util.Scanner;

/**
   You are to take the if test below and implement the grade scale we are using for CS401 including the + and - levels of each letter grade:
score >= 97% == A+      score < 97% == A  score < 93% == A-

score < 90% == B+ score < 87% == B  score < 83% == B-

score < 80% == C+ score < 77% == C  score < 73% == C-

score < 70% == D+ score < 67% == D  score < 63% == D-

score < 60% == F
NOTE!!!! Since you are having to store a 2 character value for the letter grade, you likely will need to choose a datatype that isn't char!
*/

public class Lab3
{
   public static void main(String[] args)
   {
      double test1,     // Test score #1
             test2,     // Test score #2
             test3,     // Test score #3
             average;   // Average test score
      String grade;       // Letter grade

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get three test scores from the user.
      System.out.print("Enter test score #1: ");
      test1 = keyboard.nextDouble();
      
      System.out.print("Enter test score #2: ");
      test2 = keyboard.nextDouble();
      
      System.out.print("Enter test score #3: ");
      test3 = keyboard.nextDouble();
      
      // Calculate the average test score.
      average = (test1 + test2 + test3) / 3;

      // Determine the letter grade.
      // Put your if test block here **************************************************************************
	  if (average >= 97){
        grade = "A+";
     }
     else if (average >= 93 && average < 97){
        grade = "A";
     }
     else if (average >= 90 && average < 93){
      grade = "A-";
      }
      else if (average >= 87 && average < 90){
         grade = "B+";
      }
      else if (average >= 83 && average < 87){
         grade = "B";
      }
      else if (average >= 80 && average < 83){
         grade = "B-";
      }
      else if (average >= 77 && average < 80){
         grade = "C+";
      }
      else if (average >= 73 && average < 77){
         grade = "C";
      }
      else if (average >= 70 && average < 73){
         grade = "C-";
      }
      else if (average >= 67 && average < 70){
         grade = "D+";
      }
      else if (average >= 63 && average < 67){
         grade = "D";
      }
      else if (average >= 60 && average < 63){
         grade = "D-";
      }
      else if (average < 60){
         grade ="F";
      }
      else{
         grade = "?";
      }
	  
	  
	  //**********************************************************

      // Display the average test score.
      System.out.println("Average score: " + average);

      // Display the letter grade.
      System.out.println("Letter grade: " + grade);
   }
}
