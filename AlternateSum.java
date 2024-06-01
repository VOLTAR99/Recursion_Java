//Given  a number n. Find the sum of  natural numbers till n but with alternate sings.
//n=5; 1-2+3-4+5=3

import java.util.Scanner;

public class AlternateSum {
    static int Alternate(int n){
        if(n == 0) return n;

        if(n%2 == 0) return Alternate(n-1)-n;

        else return Alternate(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Alternate(n));
    }
}
