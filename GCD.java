//Given two numbers x and y. Find the greatest common divisor of x and y using recursion. GCD and LCM
//Using Euclid's Algorithm
//gds(x,y) = gcd(y,x%y)
//gcd(x,0) = x
//LCM = (x * y)/GCD

import java.util.Scanner;

public class GCD {
    static int GCD(int x, int y){
        if(y==0) return x;
        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("GCD :"+GCD(x,y));
        System.out.println("LCM :"+(x*y)/GCD(x,y));

    }
}
