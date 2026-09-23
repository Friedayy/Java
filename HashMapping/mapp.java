package HashMapping;

import java.util.HashMap;

class Solution {
    public int frequency(int[] arr, int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        return freq.get(target);


    }
}
public class mapp {
    public static void main(String[] args) {
        Solution result = new Solution();
        int[] arr = {5, 2, 5, 7, 2, 5, 9, 2};
        int target = 5;
        int obj = result.frequency(arr, target);
        System.out.println(obj);
    }
}
