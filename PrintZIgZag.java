package Recursion;
import java.util.Scanner;

public class PrintZIgZag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Zig(n);
    }
    static void Zig(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Zig(n-1);
        System.out.println(n);
        Zig(n-1);
        System.out.println(n);

    }
}
