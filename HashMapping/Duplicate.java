/*
Return the number of different elements that appear more than once.
Expected:
3
 */
package HashMapping;

import java.util.HashMap;

class Solution {
    public int countDuplicates(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int x: arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        int count = 0;
        for(int x : arr){
            int frequency = freq.get(x);
            if(frequency > 1){
                count++;
            }
        }
        return count;

    }
}
public class Duplicate {
    public static void main(String[] args) {
        Solution result = new Solution();
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};
        int obj = result.countDuplicates(arr);
        System.out.println(obj);

    }
}
