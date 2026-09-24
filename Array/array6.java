/*
return the pattern:

* * * * *
* * * *
* * *
* *
*

 */


package Array;
public class array6 {
    public static void main(String[] args) {
        for(int i = 4; i>=0;i--){
            System.out.print("*" + " ");
            for(int j = i; j>0;j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
