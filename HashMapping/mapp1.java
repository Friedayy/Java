package HashMapping;

import java.util.HashMap;

class Solution {
    public int countDuplicates(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        int count= 0;
        for(int k : freq.keySet()){
            int frequency = freq.get(k);
            if(frequency>1){
                count++;
            }
        }
       return count;
    }
}
public class mapp1 {
    public static void main(String[] args) {
        Solution result = new Solution();
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};
        int obj = result.countDuplicates(arr);
        System.out.println(obj);
    }
}
