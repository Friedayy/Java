/*
Write a Java program using a while loop that prints all factors of a number.
Example:
Input: 12
Output:
1
2
3
4
6
12
Use the same basic idea you just used for checking prime numbers.
 */
import java.util.Scanner;
public class loop16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter number: ");
    int i = scanner.nextInt();
    int divisor = 1;

    while (divisor <= i) {
      if(i %divisor ==0){
        System.out.println(divisor);
      }
      divisor++;
    }
    
    scanner.close();
  }
}
