import java.util.*;
public class sod {
    static int SOD(int n){
        //base case
        if( n>0 && n<=9){
            return n;
        }

        //recursive work --> small ans
        int smallAns = SOD(n/10);

        //self work
        return smallAns + n%10;
    }


    public static void main(String[] args) {
        System.out.println(SOD(1234));
    }
}

//or

//import java.util.*;
//public class sod {
//    static int SOD(int n){
//        //base case
//        if( n>0 && n<=9){
//            return n;
//        }
//        return SOD(n/10) + n%10
//
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(SOD(1234));
//    }
//}

//or


//public class sod {
//    static int SOD(int n){
//        //base case
//        if( n>0 && n<=9) return n;
//        return SOD(n/10) + n%10
//    }
//    public static void main(String[] args) {
//        System.out.println(SOD(1234));
//    }
//}
