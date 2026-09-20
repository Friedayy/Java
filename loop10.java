/*
Find the largest digit in a number using a while loop.
Example:
Input: 58329
Output: Largest digit = 9
 */
import java.util.Scanner;
public class loop10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("input: ");
    int i = scanner.nextInt();
    int digit;
    int max = 0;
    while (i>0) {
      digit = i%10;
      if(max<digit){
        max = digit;
      }
      i = i/10;
    }
    System.out.println("Largest digit = " + max);
    scanner.close();
  }
}
