import java.util.Scanner; // import the Scanner class to gain access to make our Scanner object

public class Lab2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); // keyboard is now how we will prompt for input
    String userName;
    double income,taxdue;
    
    // Enter username and press Enter
    System.out.print("Enter your name and income on the same line separated by an empty space i.e. mike 12000: "); 
    userName = keyboard.next();
    income = keyboard.nextDouble();
    taxdue = income * .1;
       
    System.out.println("Taxpayer name is: " + userName);  
    System.out.println("Their income was: " + income);
    System.out.println("Their tax amount due is: "+ taxdue);
  }
}