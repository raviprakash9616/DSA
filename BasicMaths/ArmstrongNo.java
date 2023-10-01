package BasicMaths;

public class ArmstrongNo {
    public static void checkArmstrong(int n){
        int revNo=0;
        int dup=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
        if(sum==dup){
            System.out.println("NO IS ARMSTRONG");
        }
        else{
            System.out.println("No Is Not A Armstrong");
        }
    }
    public static void main(String[] args) {
checkArmstrong(371);
    }
}
