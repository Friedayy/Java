/*
Write a Java program to calculate the sum of all digits of a number using a while loop.

Example:
Input:
12345

Output:
Sum = 15

Because:
1 + 2 + 3 + 4 + 5 = 15

Constraints
- Use while loop.
- Use % 10 to extract digits.
- Use / 10 to remove digits.
- No strings.

Hint: This time, instead of building a reverse number, add each extracted digit to sum. */
import java.util.Scanner;
public class loop6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int i = scanner.nextInt();
    int sum = 0;
    while (i>0) {
      int digit = i % 10;
      sum = sum + digit;
      i = i/10;
    }
    System.out.println("Sum = " + sum);
    scanner.close();
  }
}
