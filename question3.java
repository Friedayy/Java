//Check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class question3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    if(num>0){
      System.out.println("the number is positive.");
    }
    else if(num<0){
      System.out.println("the number is negative.");
    }
    else{
      System.out.println("the number is zero.");
    }
    scanner.close();
  }
}
