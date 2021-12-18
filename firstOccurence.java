package Recursion;

public class firstOccurence {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,67,5,4,3,3,3,4,6,7,7};
        int ans=firstOccurrence(arr,0,3);
        System.out.println(ans);

    }
    static int firstOccurrence(int[] arr , int index,int x){
        if(index==arr.length){
            return -1;
        }

        if(arr[index]==x){
            return index;
        }else{
            int first=firstOccurrence(arr,index+1,x);
            return first;
        }
    }
}
