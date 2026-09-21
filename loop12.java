/*
Write a Java program using a while loop to check whether a number is an Armstrong number (3-digit).
An Armstrong number is a number where the sum of the cubes of its digits equals the original number.
Example 1:
Input: 153
1³ + 5³ + 3³ = 153
Output: Armstrong number
 */
import java.util.Scanner;
public class loop12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int i = scanner.nextInt();
    int original = i;
    int digit;
    int sum =0;
    while (i>0) {
      digit = i %10;
      sum += digit*digit*digit;
      i = i/10;
    }
    if(sum==original){
       System.out.println(sum);
       System.out.println("Armstrong number");
    }
    else{
      System.out.println(sum);
      System.out.println("Not an Armstrong number");
    }
   
    scanner.close();
  }
}
