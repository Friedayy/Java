/*
Write a program to find the frequency of every element:
int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};
Expected frequencies:
1 → 2
2 → 3
3 → 2
4 → 1
You can print in any order because HashMap does not guarantee ordering.
 */
package HashMapping;
import java.util.HashMap;
public class question1 {
    public static void main(String[] args) {
        HashMap<Integer , Integer> i = new HashMap<>();
        int[] arr = {1,2,2,3,1,4,2,3};
        for(int x : arr){
            i.put(x, i.getOrDefault(x, 0) + 1);
        }
        System.out.println(i);

    }
}
