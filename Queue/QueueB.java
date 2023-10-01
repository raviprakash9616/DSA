package Queue;

public class QueueB {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear ==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }


        // Add Operations
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue Is Full");
                return ;
            }
            // Add First Element
            if(front==-1){
                front=0;
            }
            rear=(rear+1) % size;
            arr[rear]=data;

        }

        // Remove The Element
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return -1;
            }
            int result=arr[front];
            // Delete Last Element
           if(front==rear){
               rear=front=-1;
           }
           else{
               front=(front+1)%size;
           }
           return result;
        }
        // Peek Operation
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        QueueA.Queue q=new QueueA.Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
