package HashMapping;

import java.util.HashMap;

class Solution {
    public int firstUnique(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        for(int x: arr){
            int frequency = freq.get(x);
            if(frequency== 1){
                return x;
            }
        }
        return -1;
    }
}
public class mapp2 {
    public static void main(String[] args) {
        Solution result = new Solution();
        int[] arr = {4, 5, 1, 2, 1, 4, 5};
        int obj = result.firstUnique(arr);
        System.out.println(obj);
    }
}