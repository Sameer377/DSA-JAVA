public class Queue {
    int front=-1;
    int rear=-1;
    int queue[];
    int max;

    public Queue(int x){
        this.queue=new int[x];
        this.max=x;
    }
    boolean isEmpty(){
        boolean res =false;
        if(rear==-1 || front > rear){
            res = true;
            front=-1;
            rear=-1;
        }

        return res;
    }

    boolean isFull(){
        return (rear==max-1);
    }


    public void enQueue(int n){
        if(isFull()){
            System.out.println("Full");
            return;
        }
            if(front==-1){
                front++;
            }
            this.queue[++rear] = n;
        
    }

    public int deQueue(){
        
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        return this.queue[front++];

    }

    public void traverse(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        for(int i = front;i<=rear;i++){
            System.out.print(this.queue[i]+" ");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        
        
        
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        
        queue.traverse();

    }

}
