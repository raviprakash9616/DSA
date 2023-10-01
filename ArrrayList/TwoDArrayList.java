package ArrrayList;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
//        ArrayList<Integer> list1=new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        mainList.add(list1);
//
//        ArrayList<Integer> list2=new ArrayList<>();
//        list2.add(3);
//        list2.add(4);
//        mainList.add(list2);
//  // Traverse The Main List To FindOut the Element Inside The Main List
//        for(int i=0;i< mainList.size();i++){
//            // To Find Out The Current List From The Main List
//            ArrayList<Integer>currList=mainList.get(i);
//            for(int j=0;j< currList.size();j++){
//                System.out.print(currList.get(j)+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(mainList);

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        // Loop To Store The Element In An ArrayList
        for(int i=1;i<=5;i++){
           list1.add(i*1);
           list2.add(i*2);
           list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        for (int i=0;i< mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
