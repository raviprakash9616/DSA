package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {
    static  class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean getPath(Node root,int n,ArrayList<Node>path){
        if(root==null){
            return false;
        }
        // Add The Path
        path.add(root);
        // Root data=n that means we have found the node we return true because we don't need to go in depth
        if(root.data==n){
            return true;
        }
        boolean foundLeft=getPath(root.left,n,path);
        boolean foundRight=getPath(root.right,n,path);

        if(foundLeft || foundRight){
            return true;
        }
     // Remove The path because if foundLeft And FoundRight is not Return true
       path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);

        // Last Common Ancestor
         int i=0;
         for(;i< path1.size() && i< path2.size(); i++){
             if(path1.get(i) !=path2.get(i)){
                break;
             }
         }
         // Last equal Node->i-1
        Node lca=path2.get(i-1);
         return lca;
    }

    // Approach 2 Time Complexity O(n) we are not using any extra data structure to store
    // We are only using the Stack Memory if we consider the stack memory the we are using o(1) Space Complexity
    public static Node lca2(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);
        // If Node Is not present in left we return right Lca
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }

        // if leftLca And rightLca is not equal to null we will return root node
        return root;

    }

    public static void main(String[] args) {
        //        1
//              /   \
//            2       3
//           / \     /  \
//          4   5    6   7
     Node root=new Node(1);
        root.left =new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int n1=4, n2=5;
        System.out.println(lca2(root,n1,n2).data);
    }
}
