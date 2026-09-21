/*
Write a Java program using a while loop to check whether a number is prime.
A prime number has exactly two factors: 1 and itself.
 */
import java.util.Scanner;
public class loop15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int i = scanner.nextInt();
    int divisor = 1;
    int count =0;
    while (divisor <= i) {
      if(i %divisor==0){
        count++;
      }
      divisor++;
    }
    if(count==2){
      System.out.println("The number is a prime and count is " + count);
    }
    else{
      System.out.println("the number is not a prime number.");
    }
    scanner.close();
  }
}