/*Write a Java program that takes an integer and determines whether it is:

Positive even

Positive odd

Negative even

Negative odd

Zero */
import java.util.Scanner;
public class question6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    if(num>0 && num % 2==0){
      System.out.println(num + " is a positive even integer.");
    }
    else if(num>0 && num % 2 !=0){
      System.out.println(num + " is a positive odd integer.");
    }
    else if(num<0 && num % 2 ==0){
      System.out.println(num + " is a negative even integer.");
    }
    else if(num<0 && num % 2 !=0){
      System.out.println(num + " is a negative odd integer.");
    }
    else{
      System.out.println(num + " is neither a positive nor a negative integer.");
    }
    scanner.close();
  }
}
