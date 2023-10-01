package ArrrayList;

import java.util.ArrayList;
// Pair sum In Rotated Sorted Array
public class PairSum2 {
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        int bp=-1;
        int n= list.size();
        // To Find Out The Breaking Point And Initialize lp and rp pointer by Using Two Pointer Approach
        for(int i=0;i< list.size()-1;i++){
            if(list.get(i)> list.get(i+1)){
                 bp=i;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list.get(lp)+ list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+ list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=17;
        System.out.println(pairSum1(list,target));
    }
}
