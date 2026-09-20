/*
Challenge: Count Even and Odd Digits
Write a Java program that takes an integer and counts how many even and odd digits it contains.
Example:
Input:
123456

Output:
Even digits = 3
Odd digits = 3

Another example:
Input:
2468

Output:
Even digits = 4
Odd digits = 0

Rules:
- Use a while loop.
- Use % 10 and / 10.
- No strings.
- Use if-else.
- Handle zero appropriately.
Your task
Before writing code, think:
1. How do you extract each digit?
2. How do you check whether the digit is even or odd?
3. What variables do you need to count each category?
 */
import java.util.Scanner;
public class loop8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int i = scanner.nextInt();
    int digit;
    int evencount = 0;
    if(i==0){
      evencount++;
    }
    int oddcount = 0;
    while (i>0) {
      digit = i % 10;
    if(digit %2==0){
      evencount ++;
    }
    else{
      oddcount ++;
    }
    i = i/10;
    }
    System.out.println("Even digits = " + evencount);
    System.out.println("Odd digits = " + oddcount);
    scanner.close();
  }

}
