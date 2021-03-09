import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class A2 {
    public static void main(String args[]) throws FileNotFoundException,IOException {
      double taxable,ltax,ftax,takehome;
	  int income,retire;
	  // payroll tax is a flat 6.2% of taxable
	  // state tax is a flat 3.07% of taxable
	  double ptax = 0.062;
	  double stax = 0.0307;
      String name;
      boolean city;
	  // make scanner to read input file
	  Scanner infile = new Scanner (new File(args[0]));
	  //make filewriter for output file
	  FileWriter outfile = new FileWriter ("a2output.txt");
	  //////////Begin loop
	  while(infile.hasNext()){
		  //use scanner to set values for income,retire,name,city
		  name = infile.next();
		  income = infile.nextInt();
		  retire = infile.nextInt();
		  city = infile.nextBoolean();

		  // calc taxable as income - retire
		  taxable = (income - retire);
		  // city residents pay 2% of their txable income to local taxable otherwise its 1% for non city
		  if (city == true) ltax = 0.02;
		  else ltax = 0.01;

		/* Federal tax brackets
		taxable is:
		0-8500 0%
		less than or eqaul to 12000 10%
		less than or eqaul to 20000 15%
		less than or equal to 50000 20%
		over that amount is 25%
		** this should be an inclusive test block of ascending or descending tests OR two sided AND
		*/

		  if(taxable > 8500 && taxable <= 12000) ftax = 0.1;
		  else if(taxable > 12000 && taxable <= 20000) ftax = 0.15;
		  else if(taxable >20000 && taxable <= 50000) ftax = 0.2;
		  else if(taxable > 50000) ftax = 0.25;
		  else ftax = 0;

		  takehome = taxable - (taxable*ftax + taxable*stax + taxable*ltax + taxable*ptax);
		  outfile.write("Taxpayer Name: " + name + "\n");
		  outfile.write("FTax is: " + taxable*ftax + "\n");
		  outfile.write("STax is: " + taxable*stax + "\n");
		  outfile.write("LTax is: " + taxable*ltax + "\n");
		  outfile.write("PTax is: " + taxable*ptax + "\n");
		  outfile.write("Takehome is: " + takehome + "\n");
	  }
	  infile.close();
	  outfile.close();
	  //Output phase. You MAY output to terminal in addition to the FILE but the FILE output is required!
	  //Output each on their own line with labeling of each value. See a2output.png
	 
	  
      
      //////////end loop
	  // close your output file
    }//main
}//class