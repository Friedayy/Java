/*
Write a Java program to check whether a number is a palindrome using a while loop.
A palindrome reads the same forward and backward.
Examples:
Input: 121
Output: Palindrome

Input: 123
Output: Not a Palindrome

Constraints
- Use while loop.
- Use % 10 and / 10.
- No strings.
- Reverse the number and compare it with the original.
 */
import java.util.Scanner;
public class loop7 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int i = scanner.nextInt();
    int original = i;
    int reverse = 0;
    while (i>0) {
      int digit = i % 10;
      reverse = reverse * 10 + digit;
      i = i/10;
    }
    if(original==reverse){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not a Palindrome");
    }
    scanner.close();
  }
}
