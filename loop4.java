/*
Write a Java program to calculate the factorial of a number using a while loop.
Input:
5

Output:
Factorial = 120

Constraints
- Use while loop.
- Take input using Scanner.
- No recursion.
- Handle 0! = 1.
Hint: You need a variable to store the multiplication result, similar to how you used sum for addition.
*/
import java.util.Scanner;
public class loop4 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number: ");
  int i = scanner.nextInt();
  int result = 1;
  while (i>0) {
    result *= i;
    i--;
  }
  System.out.println("Factorial = " + result);
  scanner.close();
    
  }
}
