import java.util.Scanner;
public class Lab1 {
    public static void main(String args[]) {
      Scanner key = new Scanner(System.in);
      int yob;
      System.out.print("Enter your year of brith as a 4 digit number: ");
      yob = key.nextInt();
      String gen = "?";
      if (yob <= 1924)
        gen = "Greatest Generation";
      else if (yob >= 1925 && yob <= 1945)
        gen = "Silent Generation 2";
      else if (yob >= 1946 && yob <= 1964)
        gen = "Silent Generation 3";
      else if (yob >= 1964 && yob <= 1980)
        gen = "Silent Generation 4";
      else if (yob >= 1981 && yob <= 1996)
        gen = "Silent Generation 5";
      else if (yob >= 1997)
        gen = "Silent Generation 6";
      System.out.println("Your generation is: " + gen);
    }
}