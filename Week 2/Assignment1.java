import java.util.Scanner; // import the Scanner class to gain access to make our Scanner object

public class Assignment1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); // keyboard is now how we will prompt for input
    String userName;
    double income,taxable,retire,takehome; // these are the variables you will need to set or calculate
    final double ftax = 0.1;
    final double stax = 0.0307;
    final double ltax = 0.01;
    final double ptax = 0.062;
    // name income 401k
    //calc taxable (income -retire)
    //calc 10% fedtax, 3.07% statetax, 1% localtax, 6.2% payroll tax
    //calc takehome (taxable - all the taxes)
    // Enter username and press Enter
    System.out.print("Enter your name, income, and 401k contribution on the same line separated by an empty space i.e. mike 12000 2500: "); 
    userName = keyboard.next();
    income = keyboard.nextDouble();
    retire = keyboard.nextDouble();
    //Taxable income
    taxable = income - retire;
    //Final income after taxes
    takehome = taxable - ((taxable*ftax)+(taxable*stax)+(taxable*ltax)+(taxable*ptax)); 

    System.out.println("Taxpayer name is: " + userName);  
    System.out.println("Their income was: " + income);
    System.out.println("Their 401k contribution was: " + retire);
    System.out.println("Their taxable income was: " + taxable);
    System.out.println("Their federal tax amount due is: " + ftax * taxable);
    System.out.println("Their state tax amount due is: " + stax * taxable);
    System.out.println("Their local tax amount due is: " + ltax * taxable);
    System.out.println("Their payroll tax amount due is: " + ptax * taxable);
    System.out.println("Their takehome amount is: "+ takehome);
  }
}