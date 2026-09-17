/*Write a Java program to check whether a given year is a leap year or not using if-else.

Rules:

A year divisible by 400 → Leap year.

A year divisible by 100 → Not a leap year.

A year divisible by 4 → Leap year.

Otherwise → Not a leap year. */
import java.util.Scanner;
public class question5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    if (num % 400 == 0) {
     System.out.println("Leap Year");
    }
    else if (num % 100 == 0) {
      System.out.println("Not a Leap Year");
    }
    else if (num % 4 == 0) {
      System.out.println("Leap Year");
    }
    else {
      System.out.println("Not a Leap Year");
    }
    
    scanner.close();
  }
}
