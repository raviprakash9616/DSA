package BasicMaths;
import java.lang.Math;
public class CountDigit {
    public static int count(int N){
        int cnt=(int)Math.floor(Math.log10(N)+1);
        return cnt;
    }



    public static void main(String[] args) {
    int res=count(203);
        System.out.println(res);
    }
}
