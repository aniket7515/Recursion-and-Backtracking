package Recursion;
import java.util.Scanner;
public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Incdec(n);

    }
    public static void Incdec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Incdec(n-1);
        System.out.println(n);
    }
}

// Q) Print increasing and decreasing
// For ex : n=4
//output

//4
//3
//2
//1
//1
//2
//3
//4