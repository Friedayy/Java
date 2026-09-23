/*
Now no solution yet. You solve it.
int[] arr = {4, 2, 7, 2, 4, 4, 9, 2};
Find the element with the highest frequency.
Expected output:
4
Constraints
Don't use:
Arrays.sort()
or nested loops. */
package HashMapping;
import java.util.HashMap;
public class question {
    public static void main(String[] args) {
        HashMap<Integer, Integer> i = new HashMap<>();
        int[] arr = {4, 2, 7, 2, 4, 4, 9, 2};
        for(int x : arr){
            i.put(x, i.getOrDefault(x, 0) + 1);  
        }
        int maxfrequency = 0;
        int maxElement = 0;
        for(int y : i.keySet()){
            int frequency = i.get(y);
            if(frequency > maxfrequency){
                maxfrequency = frequency;
                maxElement = y;
            }
        }
        System.out.println("max Element is: " + maxElement);
        System.out.println("max Frequency is: " + maxfrequency);
    }
}
