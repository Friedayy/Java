/*
Find the largest element:
[7, 2, 9, 4, 1]
 */

package Array;
public class array3 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1};
        int max = arr[0];
        for(int i =1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
