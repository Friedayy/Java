import java.util.Scanner;
public class ascii {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String i = scanner.nextLine();
    char a = i.charAt(0);
    int ch = (int)a;
    System.out.println(ch);


    scanner.close();
  }
}
