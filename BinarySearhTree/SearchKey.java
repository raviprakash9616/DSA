package BinarySearhTree;

public class SearchKey {
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
    public static boolean  search(Node root, int key){
        if(root==null){
            return false;
        }
      if(root.data==key){
          return true;
      }
      if(root.data>key){
          return search(root.left,key);
      }
      else{
          return search(root.right,key);
      }
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i< values.length;i++){
            root=insert(root,values[i]);
        }
     if(search(root,6)){
         System.out.println("Found");
     }
     else{
         System.out.println("Not Found");
     }
    }
}
