//Check whether a number is even or odd.
import java.util.Scanner;
public class question4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    if(num % 2 == 0){
      System.out.print("The number is even.");
    }
    else{
      System.out.println("The number is odd");
    }
    scanner.close();
  }
}
