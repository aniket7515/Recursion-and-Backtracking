package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        ReverseArr(arr,arr.length-1);

    }
    static void ReverseArr(int[] arr, int index ){


        if(index<0){
            return;
        }
        System.out.println(arr[index]);
        ReverseArr(arr,index-1);

    }
}
