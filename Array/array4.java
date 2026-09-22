/*
int[] arr = {2, 7, 4, 9, 6, 3};
Find how many even numbers are present.
Expected output:
3
 */

package Array;

public class array4 {
    public static void main(String[] args) {
        int[] arr = {2,7,4,9,6,3};
        int count = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Number of even numbers in an array: " + count);
    }
}
