//input and sum until single digits
import java.util.Scanner;
public class questionnn {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    int digit;
    while (i>=10) {
      int sum = 0;
      while (i>0) {
        digit = i % 10;
        sum += digit;
        i = i /10;
      }
      i = sum;
    }
    System.out.println(i);
    scanner.close();
  }
}