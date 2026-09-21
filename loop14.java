/*
Write a Java program using a while loop to count the number of prime factors of a positive integer.
Example:
Input: 12
Prime factors: 2, 2, 3
Output: Number of prime factors = 3
 */
import java.util.Scanner;
public class loop14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int i = scanner.nextInt();
    int sum = 0;
    int divisor =2;
    while (i > 1) {
      if(i %divisor==0){
        sum++;
        i = i/divisor;
      }
      else{
        divisor++;
      }
      
    }
    System.out.println("No of prime numbers: " + sum);
    scanner.close();
  }
}
