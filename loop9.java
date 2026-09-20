/*
Write a Java program using a while loop that counts how many times the digit 5 appears in a number.
Example:
Input: 552515
Output: Digit 5 appears 4 times */
import java.util.Scanner;
public class loop9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int i = scanner.nextInt();
    int digit;
    int count = 0;
    while (i>0) {
      digit = i % 10;
      if(digit==5){
        count++;
      }
      i = i/10;
    }
    System.out.println("Digit 5 appears " + count + " times");
    scanner.close();
  }
}
