package BinaryTree;
import java.util.*;
public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            // If Node is -1 Means It is Null
            if (nodes[idx] == -1) {
                return null;
            }
            // Creating A New Nodes
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // Level Order Traversal
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                // For Next Line
                if(currNode==null){
                    System.out.println();
              // Check Queue Is Empty Or NOT
                   if(q.isEmpty()){
                       break;
                   }
                   else {
           // Again Add The null Value in Queue So That We Can Print Again Next Line this Is The Case If Queue Is Not Empty
                     q.add(null);
                   }
                }
            // If Null Node is not Removed from the queue means some other node has to remove
            else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.levelOrder(root);

    }
}
