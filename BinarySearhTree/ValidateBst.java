package BinarySearhTree;

public class ValidateBst {
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
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root==null){
            return true;
        }
        if(min !=null && root.data <= min.data){
            return  false;
        }
        if(max !=null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left,min,root)
                && isValidBST(root.right,root,max);
    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

        if(isValidBST(root,null,null)){
            System.out.println("Valid Bst");
        }
        else{
            System.out.println("Not Valid ");
        }
    }
}
