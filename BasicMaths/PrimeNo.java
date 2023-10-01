package BasicMaths;

public class PrimeNo {
    public static void checkPrime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
            }
            if((n/i)!=i){
                count++;
            }
        }
        if(count==2){
            System.out.println("No Is Prime No:");
        }
        else{
            System.out.println("No Is Not A Prime No:");
        }
    }
    public static void main(String[] args) {
checkPrime(23);
    }
}
