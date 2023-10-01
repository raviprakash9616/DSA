package Function;


public class CoffiecientOfNum {
    public static int fact(int num){
        int fact1=1;
        for(int i=1;i<=num;i++){
            fact1=fact1*i;
        }
        return fact1;
    }
    public static int CofficientOfN(int n,int r){
        int factN=fact(n);
        int factR=fact(r);
        int factN_R=fact(n-r);
        int cofficient=(factN)/(factR*factN_R);
        return cofficient;
    }
    public static void main(String[] args) {
      int ans=  CofficientOfN(5,2);
        System.out.println(ans);
    }
}
