import java.util.Scanner;

public class sum_of_numbers {

    static int sum(int a){
        if(a == 1) return a;  //base case
        return sum(a-1)+a;   //recursion + self work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sum(a));
    }
}
