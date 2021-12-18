package Recursion;

public class MaxOfArr {
    public static void main(String[] args) {
        int[] arr={23,456,4,6234,4676,2,24,4,5345,46,46};
        int ans=MaxOfArray(arr,0);
        System.out.println(ans);

    }
    static int MaxOfArray(int[] arr , int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int max=MaxOfArray(arr,index+1);

        if(max>arr[index]){
            return max;
        }else{
            return arr[index];
        }
    }
}
