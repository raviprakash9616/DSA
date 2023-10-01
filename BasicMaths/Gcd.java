package BasicMaths;

public class Gcd {
    public static int gcdno(int n1,int n2) {
//        for(int i=Math.min(n1,n2);i>=1;i--){
//            if(n1%i==0 && n2%i==0){
//                System.out.println(i);
//                break;
//            }
//        }
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        if (n1 == 0) {
            return n2;
        }
        else {
            return n1;
        }
    }
    public static void main(String[] args) {
   int res=gcdno(24,48);
        System.out.println(res);
    }
}
