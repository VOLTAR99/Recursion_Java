import java.util.*;
public class fibancci_recursion {
    static int fib(int n){
        if(n==0 || n==1) return n;

        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
            System.out.print(fib(i));
            System.out.print(" ");
        }
    }
}
