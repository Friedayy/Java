/*
int[] arr = {2, 7, 11, 15};
int target = 9;
Find two indices whose values add up to target.
Expected:
[0, 1]
Example
arr[0] = 2
arr[1] = 7

2 + 7 = 9
Rules
You cannot use nested loops.
 */
package HashMapping;
import java.util.HashMap;
public class interview {
    public static void main(String[] args) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] arr = {2,7,11,15};
        int target = 9;
        for(int i = 0; i<arr.length; i++){
            int current = arr[i];
            int needed = target - current;
            if(freq.containsKey(needed)){
                System.out.println("[" + freq.get(needed) + "," + i + "]");
                return;
            } 
            freq.put(current, i);
        }
    }
}
