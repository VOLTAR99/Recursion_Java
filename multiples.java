//given a number num and a value k. Print multiples of num
//num = 12, k = 5
//output: 12,24,36,48,60
import java.util.*;
public class multiples {

    static void Multiples(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        Multiples(n,k-1);

        System.out.println(n*k);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        Multiples(num, k);
    }
}
