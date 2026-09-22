package Array;
//Write a Java program that actually reverses the array, not just prints it backwards.
public class array5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
