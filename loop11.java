/*
Write a Java program using a while loop to find the smallest digit in a positive integer.
Example:
Input: 58329
Output: Smallest digit = 2
 */
import java.util.Scanner;
public class loop11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int i = scanner.nextInt();
    int digit;
    int min = i %10;
    while (i>0) {
      digit = i%10;
      if(min>digit){
        min=digit;

      }
      i = i/10;
    }
    System.out.println(min);
    scanner.close();
  }
}
