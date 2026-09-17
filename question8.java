/*Write a Java program to calculate an electricity bill based on the number of units consumed.

rules:
units consumed                rate
0-100                         2 rupees per unit
101-200                       3 rupees per unit
above                         5 rupees per unit

Important: Use slab-based billing. Each range has its own rate. */
import java.util.Scanner;
public class question8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int unit = scanner.nextInt();
    int calculation;
    if(unit<0){
      System.out.println("Invalid input.");
    }
    else if(unit<=100){
      calculation = 2 * unit;
      System.out.println("Bill is: " + calculation);
    }
    else if(unit<=200){
      calculation = 2 * unit + (unit - 100) * 3;
      System.out.println("Bill is: " + calculation);
    }
    else{
      calculation = 3 * unit + (unit - 200) * 5;
      System.out.println("Bill is: " + calculation);
    }
    scanner.close();
  }
}