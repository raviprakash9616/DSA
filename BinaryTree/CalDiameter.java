package BinaryTree;

public class CalDiameter {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {  // O(n^2)
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            int hgt=Math.max(lh,rh)+1;
            return hgt;
        }

        // Calculate The Diameter
        public static int diameter1(Node root){
            if(root==null){
                return 0;
            }
            int leftDiam=diameter1(root.left);
            int leftHt=height(root.left);
            int rightDiam=diameter1(root.right);
            int rightHt=height(root.right);
            int selfDiam=leftHt+rightHt+1;
            int diam=Math.max(selfDiam,Math.max(leftDiam,rightDiam));
            return diam;
        }
         static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
         }

    public static Info diameter(Node root){    // 0(n)
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);
        int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht, rightInfo.ht) +1;

        return new Info(diam,ht);
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

        System.out.println(diameter(root).diam);
    }
}
