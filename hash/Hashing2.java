package hash;
import java.util.HashMap;
import java.util.*;
public class Hashing2 {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,3,4};
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++) {
            int value = map.getOrDefault(arr[i], 0);
            System.out.println(value);
            map.put(arr[i], value+1);
        }
            System.out.println(map);
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
            }
        }
    }

}
