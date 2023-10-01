package BinarySearhTree;

public class PrintInRange {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
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
    public static void printRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printRange(root.right,k1,k2);
        }
        else if(root.data<k1){
            printRange(root.left,k1,k2);
        }
        // root.data>k2
        else{
            printRange(root.right,k1,k2);
        }
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
            Node root = null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

        printRange(root,5,12);
    }
}
