public class SingleyLinkedList {
    
   

    class Node {
        public int data;
        public Node next=null;

        public Node(int Data){
            this.data = Data;
            this.next = null;
        }
    }
    Node head;
    public void insertAtEnd(int data) {
        if(head==null){
            head=new Node(data);
            return;
        }

        Node ptr = head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }

        ptr.next=new Node(data);
    }

    public void deleteAtEnd(){
        Node ptr = this.head;
        if(head.next==null){
            head=null;
            return;
        }

        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;
    }

    public void traverse(){
        Node start = head;
        while(start!=null){
            System.out.println(start.data+" ");
            start=start.next;
        }
    }


    public static void main(String[] args) {
        SingleyLinkedList listy = new SingleyLinkedList();
        listy.insertAtEnd(10);
        listy.insertAtEnd(20);
        listy.insertAtEnd(30);
        listy.insertAtEnd(40);
       listy.traverse();

    }

}
