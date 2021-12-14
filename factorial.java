package Recursion;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(factorial(n));

    }
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
