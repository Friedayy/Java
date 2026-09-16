import java.util.Scanner;
public class conditionals {
  public static void main(String[] args){
    Scanner amaan = new Scanner(System.in);
    int age = amaan.nextInt();
    if(age>=18){
      System.out.println("amaan is an adult");
    }else{
      System.out.println("amaan is a Teenager");
    }

    amaan.close();
  } 
}

