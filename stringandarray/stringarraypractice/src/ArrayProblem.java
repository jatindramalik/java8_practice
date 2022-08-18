import java.util.Arrays;

public class ArrayProblem {

    public static void main(String[] args) {
        int [] arr = {12,3,5,4,78,47};

        for(int i =0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println(Arrays.stream(arr).sum());
        System.out.println("=====================");

        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] !=arr[i+1]){
                System.out.println(arr[i+1]);
            }
        }
    }
    
}
