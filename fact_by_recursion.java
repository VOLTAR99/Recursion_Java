import java.util.*;
public class fact_by_recursion {
    static int factorial(int n){
        if(n==0) return 1;    //base condition

        int smallAns = factorial(n-1);   //smaller problem recursion

        int ans = n * smallAns;      //bigger problem self work

        return ans;

        //return n * smallAns;
        //we can directly call " return n*smallAns " without even initialize a variable. But did for better understanding
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        System.out.println(factorial(a));
    }
}
