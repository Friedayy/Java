/*
Check for Perfect Number
Write a Java program using a while loop to check whether a number is a Perfect Number.
A perfect number is a number whose proper divisors (excluding itself) add up to the original number.
Example:
Input: 6
Divisors: 1, 2, 3
1 + 2 + 3 = 6

Output: Perfect number
 */
import java.util.Scanner;
public class loop13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int i = scanner.nextInt();
    int original = i;
    int sum=0;
    int divisor =1;
    while (divisor < i) {
      if(i %divisor == 0){
        sum += divisor;
      }
      divisor++;
    }
    if(sum == original){
      System.out.println("perfect number: " + sum);
    }
    else{
      System.out.println("not a perfect number: " + sum);
    }
    scanner.close();
  }
}
