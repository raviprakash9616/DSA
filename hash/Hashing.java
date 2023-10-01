package hash;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
//Creating A HashSet;
        HashSet<Integer>set=new HashSet<>();
        //Adding Element
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(6);
        // Search - contains
        if(set.contains(7)){
            System.out.println("Set Contains");
        }
        if(!set.contains(2)){
            System.out.println("Set Not Contains");
        }
        //Delete
        set.remove(3);
        if(!set.contains(3)){
            System.out.println("Set Does Not Contains ");
        }
        //Size
        int s=set.size();
        System.out.println("Size Of Set Is:"+ s );
        //Printing The Elements In Set
        System.out.println(set);
        Iterator it=set.iterator()  ;
        //Iterator contain next and hasNext()
        //hasNext return true   & False
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
