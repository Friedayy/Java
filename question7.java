/*Write a Java program that simulates an ATM withdrawal.

Inputs:

Account balance

Withdrawal amount

Rules:

If withdrawal amount is less than or equal to 0 → Invalid amount

If withdrawal amount is greater than balance → Insufficient balance

If withdrawal amount is a multiple of 100 → Process withdrawal

Otherwise → Enter amount in multiples of 100 */
import java.util.Scanner;
public class question7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int balance = scanner.nextInt();
    int amount = scanner.nextInt();
    if(amount<=0){
      System.out.println("Invalid amount.");
    }
    else if(amount % 100 == 0 && amount > balance){
      System.out.println("Insufficient balance.");
    }
    else if(amount % 100 == 0 && amount <= balance){
      System.out.println("Process withdrawal.");
    }
    else{
      System.out.println("Enter amount in multiples of 100.");
    }
    scanner.close();
  }
}
