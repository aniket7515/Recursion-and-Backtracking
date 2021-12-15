package Recursion;
import java.util.Scanner;

public class logarithmicPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int n=in.nextInt();

        System.out.println(power(x,n));

    }
    static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int ans=power(x,n/2)*power(x,n/2);

        if(n%2==1){
            ans=ans*x;
        }return ans;
    }
}
