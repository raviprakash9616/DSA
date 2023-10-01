package BinaryTree;

public class CountNodes {
    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public static int cnt(Node root){
            if(root==null){
                return 0;
            }
            int leftCount=cnt(root.left);
            int rightCount=cnt(root.right);
            int treeCount=leftCount+rightCount+1;
            return treeCount;
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

        System.out.println(cnt(root));
    }
}
