/*
Write a Java program to calculate the sum of all even numbers from 1 to N using a while loop.
      Input:
      10

      Output:
      Sum = 30
Constraints:
- Use while loop.
- Use if-else to check even numbers.
- Take N as input.
- No mathematical formula.
*/
import java.util.Scanner;
public class loop3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = scanner.nextInt();
    int i = 1;
    int sum = 0;
    while (i<=n) {
      if(i%2==0){
         sum += i;
      }
      i++;
    }
    System.out.println("Sum: " + sum);

    scanner.close();
  }
}
