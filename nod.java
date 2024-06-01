public class nod {
    static int NOD(int n){
        //base problem
        if(n>0 && n<=9)  return 1;
        return NOD(n/10) + 1;
    }
    public static void main(String[] args) {
        System.out.println(NOD(1234));
    }
}
