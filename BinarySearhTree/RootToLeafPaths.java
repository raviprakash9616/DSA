package BinarySearhTree;
import java.util.*;
public class RootToLeafPaths {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }


    public static Node insert(Node root, int val){
        // Create A New Node and insert value in the root
        if(root==null){
            root=new Node(val);
            return root;
        }
        // Checking For Left Subtree in this we are returning root.left pointer
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        // Checking For Right Subtree
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

 public static void prinPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
     System.out.println("N");
 }

    public static void printRootToLeaf(Node root, ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            prinPath(path);
        }
        printRootToLeaf(root.left,path);
        printRootToLeaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        printRootToLeaf(root,new ArrayList<>());
    }
}
