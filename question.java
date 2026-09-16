import java.util.Scanner;
public class question {
  public static void main(String[] args) {
    Scanner amaan = new Scanner(System.in);

    int grade = amaan.nextInt();

    if(grade>=90){

      System.out.println("Grade A");
    }else if(grade>=70){

      System.out.println("Grade B");
    }else if(grade>=50){

      System.out.println("Grade C");
    }else if(grade>=35){

      System.out.println("Grade D");
    }else {

      System.out.println("FAIL");
    }
    amaan.close();
  }
  
}
