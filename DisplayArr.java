package Recursion;

import java.util.Scanner;
public class DisplayArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        DisplayArray(arr,0);

    }
    static void DisplayArray(int[] arr , int index){
        if(index==arr.length){
            return;
        }

        System.out.println(arr[index]);
        DisplayArray(arr,index+1);


    }
}
