package NewLinkedList;

import java.util.concurrent.ScheduledExecutorService;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // Adding The Element In  the First
    public void addFirst(int data){
        // Step-1 -> Create A NewNode
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        // Step-2 -> newNode next =head
        newNode.next=head;//link
        // Step-3 -> head=newNode
        head=newNode;
    }

    // Adding The Element In The Last
    public void addLast(int data){
        // Step-1 -> Create A NewNode
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        // Step-2 -> Tail next =newNode
        tail.next=newNode;
        // Step-3 -> tail=newNode
        tail=newNode;
    }

    // Function to print a LinkedList
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // Add Element In The Middle Of An Array
    public void add(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        // i=idx-1;  temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    // Remove First Element From Linked List
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List Is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    //Remove Last Element From The LinkedList
    public int removeLast(){
        if(size==0){
            System.out.println("Linked List Is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
         //prev: i=size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
  //Search The Element from linked List
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        //Key Not Found
        return -1;
    }
    // Search The Element Of The Linked List Using Recursion
    public int helper(Node head,int key){
      // Base Case
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){

        return helper(head, key);
    }
    // Reverse The Linked List
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    // Delete The Nth Node From Linked List
    public void  deleteNthNodefromEnd(int n){
      // Calculate Size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        // To Check Whether We Have To Delete Head Or Not
        if(n==sz){
            head=head.next; // Remove First Operation
            return;
        }
        // sz-1;
        int i=1;
        int indexToFind=sz-n;
        Node prev=head;
        while(i<indexToFind){
          prev=prev.next;
          i++;
        }
        prev.next=prev.next.next;
    }
   // To Check The Given LL Is Palindrome Or Not
    // Step -> 1: Find The Middle  Element Of The Ll

    public Node findMid(Node head){
        Node slow=head;
        Node fast= head;
        while(fast!=null && fast.next!=null){ // Helper Function
            slow=slow.next; // +1 Kadam
            fast=fast.next.next;  // +2 Kadam
        }
        return slow; // Here Slow Is My Mid
    }
    public boolean checkPalindrome(){
        // Base Case Or Corner Case
        if(head==null || head.next==null){
            return true;
        }
        // Step1 ->:To Find Mid
        Node midNode=findMid(head);

        // Step2 ->:Reverse Second Half

        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; // Right Ka Head
        Node left=head;


        //  Step3 ->: Check Left Half And Right Half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    // Ques. ->> Detect A loop Cycle in a Linked List
    public static boolean isCycle(){ // Floyd's Cycle Finding Algorithm
        Node slow =head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1 Step
            fast=fast.next.next;  // +2 Step
         if(slow==fast){
             return true; // Cycle Exists
         }
        }
        return false;   // Cycle Does Not Exist
    }

    // ques ->:  Remove a Loop/Cycle From Linked List
    public static void removeCycle(){
        // Detect Cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //Find Meeting Point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // Remove Cycle -> last.next=null
        prev.next=null;
    }
    // Question ->: Merge Sort On A Linked List
     private Node getMid(Node head){
       Node slow=head;
       Node fast=head.next;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;
     }
     private Node merge(Node head1,Node head2){
     Node mergeLl=new Node(-1);
     Node temp=mergeLl;
     while(head1!=null && head2!=null ){
         if(head1.data<=head2.data){
             temp.next=head1;
             head1=head1.next;
             temp=temp.next;
         }
         else{
             temp.next=head2;
             head2=head2.next;
             temp=temp.next;
         }
     }
     while(head1!=null){
         temp.next=head1;
         head1=head1.next;
         temp=temp.next;
     }
     while(head2!=null){
         temp.next=head2;
         head2=head2.next;
         temp=temp.next;
     }
      return mergeLl.next;
     }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        // Find Mid
        Node mid=getMid(head);
        //left && Right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);// Left Part
        Node newRight=mergeSort(rightHead);
        // Merge
        return merge(newLeft,newRight);
    }

    //  ques:->  ZigZag Linked List
    public void zigZag(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        // Reverse The Second Half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head; // Left Ka Left
        Node right=prev;// Right kA Head
        Node nextL;
        Node nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

    public static void main(String[] args) {
      LinkedList ll=new LinkedList();
//      ll.addFirst(1);
//      ll.addFirst(2);
//      ll.addLast(2);
//      ll.addLast(1);
  //    ll.add(2,9);
//      ll.print();
//        System.out.println(ll.size);
//        ll.removeFirst();
//        ll.print();
//        System.out.println(ll.size);
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);
//        System.out.println(ll.recSearch(2));
//        System.out.println(ll.recSearch(10));
//        ll.reverse();
//        ll.print();
//        ll.deleteNthNodefromEnd(3);
//        ll.print();
//        System.out.println(ll.checkPalindrome());
//        head=new Node(1);
//        Node temp=new Node(2);
//        head.next=temp;
//        head.next.next=new Node(3);
//        head.next.next.next=temp;
//        head.next.next.next=head;
//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());
//        ll.addFirst(1);
//        ll.addFirst(2);
//        ll.addFirst(3);
//        ll.addFirst(4);
//        ll.addFirst(5);
//        ll.print();
//        ll.head=ll.mergeSort(head);
//        ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
