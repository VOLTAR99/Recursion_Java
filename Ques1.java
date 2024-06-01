//Q1 - Given a number n, print the following pattern without using any loop.
//n, n-5, n-10, ..., 0, 5, 10, ..., n-5, n

//Input1: n = 16
//Output1: 16, 11, 6, 1, -4, 1, 6, 11, 16

import java.util.Scanner;

public class Ques1 {
    static void rec(int n, int m, boolean flag) {
        System.out.print(m + " ");
        if (flag == false && n == m)
            return;
        if (flag) {
            if (m - 5 > 0) rec(n, m - 5, true);

            else rec(n, m - 5, false);
        }
        else rec(n, m + 5, false);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = scn.nextInt();
        rec(n, n, true);
    }
}
