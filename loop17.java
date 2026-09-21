/*
Now modify Loop 16 so that instead of printing the factors, it prints how many factors the number has.
Example:
Input: 12
Output: Number of factors = 6
 */
import java.util.Scanner;
public class loop17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int i = scanner.nextInt();
    int divisor = 1;
    int count = 0;
    while (divisor <= i) {
      if(i %divisor ==0){
        count++;
      }
      divisor++;
    }
    System.out.println("Number of factors = " + count);
    scanner.close();
  }
}
