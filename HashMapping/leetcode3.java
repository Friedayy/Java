/*
Write a function that returns the largest element in an integer array.
Example:
[7, 2, 9, 4, 1] → 9
 */

package HashMapping;
class Solution{
    public int largestElement(int[] arr){
        int max = 0;
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
public class leetcode3 {
    public static void main(String[] args) {
        Solution i = new Solution();
        int[] arr = {7,2,9,4,1};
        int result = i.largestElement(arr);
        System.out.println(result);

    }
}
