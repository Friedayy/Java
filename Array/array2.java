/*
Find the sum of all elements.
Given:
[5, 8, 2, 10, 3]
Expected output:
28
 */


package Array;
public class array2 {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = {5, 8, 2, 10, 3};
        for(int i= 0; i<5; i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
