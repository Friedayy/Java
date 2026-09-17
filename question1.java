/*
*Given are three numbers a b c 
*Show that which number is the greatest
*also show that if two numbers are equal using if else statement.
*/
import java.util.Scanner;
public class question1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if(a>=b && a>=c){
      if(a==b && a==c){
        System.out.println("a, b, c are greatest numbers and equal");
      }else if(a==b){
        System.out.println("a and b are greatest numbers and equal");
      }else if(a==c){
        System.out.println("a and c are greatest numbers and equal");
      }else{
        System.out.println("a is the greatest number");
      }
    }else if(b>=a && b>=c){
      if(b==c){
        System.out.println("b and c are the greatest numbers and equal");
      }else{
        System.out.println("B is the greatest number");
      }
    }else{
      System.out.println("c is the greatest nubmer");
    }
    scanner.close();
  }
}