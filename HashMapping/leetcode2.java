/*
Write a function that receives an integer n and returns:
- "Even" if n is even
- "Odd" if n is odd
Examples:
8 → "Even"
5 → "Odd"
0 → "Even"
 */

package HashMapping;
class Solution{
    public String evenOdd(int num){
        if(num %2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
public class leetcode2 {
    public static void main(String[] args) {
        Solution result = new Solution();
        String obj = result.evenOdd(3);
        System.out.println(obj);
    }    
}
