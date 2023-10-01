package BinarySearhTree;

public class DeleteNode {
    static  class Node{
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

    public static Node delete(Node root,int val){
         if(root.data<val){
             root.right=delete(root.right,val);
         }
      else if(root.data>val){
           root.left=delete(root.left,val);
       }
      else{  // here root.data==value
          // Case 1: Leaf Node
       if(root.left==null && root.right==null){
           return null;
       }
       // Case 2: Single Child
         if(root.left==null){
             return root.right;
         }
         else if(root.right==null){
             return root.left;
         }
      // Case 3: Both Children
      Node IS=findInorderSuccesor(root.right);
         root.data=IS.data;
        root.right= delete(root.right,IS.data);
         }
      return root;
    }
    public static Node findInorderSuccesor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i< values.length;i++){
            root=insert(root,values[i]);
        }
     inorder(root);
        System.out.println();

      root=delete(root,5 );
        System.out.println();
        inorder(root);
    }
}
