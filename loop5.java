/*
Write a Java program to reverse a given integer using a while loop.
Input:
12345

Output:
54321

Constraints
- Use while loop.
- Use % 10 to extract the last digit.
- Use / 10 to remove the last digit.
- No strings or built-in reverse functions.

Hint: You need:
- reverse = 0
- Extract the last digit.
- Add it to the reverse number using multiplication by 10.
*/
import java.util.Scanner;
public class loop5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int i = scanner.nextInt();
    int reverse = 0;
    while (i>0) {
      int digit;
      digit = i % 10;
      reverse = reverse * 10 + digit;
      i = i/10;
    }

    System.out.println(reverse);
    scanner.close();
  }
}
