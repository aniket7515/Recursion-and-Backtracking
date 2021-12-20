package Recursion;

public class LastIndexOccurrence {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,67,5,4,3,3,3,4,6,7,7};
        int ans=LastOccurence(arr, arr.length-1, 3);
        System.out.println(ans);

    }
    static int LastOccurence(int[] arr , int index , int x){

        if(index<0){
            return -1;
        }
        if(arr[index]==x){
            return index;
        }else{
            int last=LastOccurence(arr,index-1,x);
            return last;
        }

    }
}
