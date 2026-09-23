package HashMapping;
class Solution{
    public int countEven(int[] arr){
        int count = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
public class leetcode4 {
    public static void main(String[] args) {
        Solution result = new Solution();
        int[] arr = {2,3,4,5,6,7};
        int obj = result.countEven(arr);
        System.out.println(obj);
    }
}
