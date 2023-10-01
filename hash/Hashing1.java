package hash;
import java.util.*;

import java.util.HashMap;
public class Hashing1 {
    public static void main(String[] args) {
        //country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        // HashMap is Unordered Map
        map.put("India", 100);
        map.put("China", 300);
        map.put("Indonesia", 30);
        System.out.println(map);
//           map.put
//             /     \
//        (exist)   (Not Exist)
//           |           |
//        (UpdateValue)  (New pair is insert)
        map.put("China",400);
        System.out.println(map);
//       // Search
        if(map.containsKey("Indonesia")){
            System.out.println("Key Is Present In The Map");
        }
        else{
            System.out.println("Key IS Not Present ");
        }
        //For Printing Value We Use Get Function
        //               get
        //             /     \
        //        (Key_exist)   (Key_Not_Exist)
        //           |           |
        //       (print_Value)  (Null)

        //          ( .contains key)
//                       /     \
//                     true    false
        System.out.println(map.get("China"));
        System.out.println(map.get("Iran"));
        int arr[]={ 12, 45,56};
        for(int value:arr){
            System.out.print(value+" ");
            //SYNTAX OF ITERATION IN HASHMAP
            // Map.Entry<Integer,Integer>e:Map.entrySet()
            //              |       |
            //             key    value
            for(Map.Entry<String,Integer>e:map.entrySet()) {
                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }
        }
    }
}
