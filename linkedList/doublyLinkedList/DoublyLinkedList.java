package linkedList.doublyLinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size;

    public static void main(String[] args) {

        DoublyLinkedList dll =new DoublyLinkedList();
        dll.addedNodeAtStart(10);
        dll.addedNodeAtStart(20);
        dll.addedNodeAtStart(30);
        dll.addedNodeAtEnd(100);
        dll.addedNodeAtEnd(500);
        dll.displayLinkedList();
        System.out.println();
        System.out.println();
        dll.insertAtParticularIndex(1,9000);
        dll.insertAtParticularIndex(0,1);
        dll.insertAtParticularIndex(3,66);
        dll.displayLinkedList();

    }

    public void displayLinkedList()
    {
        Node current=head;

        while(current!=null)
        {
            System.out.print(current.value+" -> ");
            current=current.next;
        }

        System.out.println("End");

        System.out.println("Print In reverse Direction");

        Node last=tail;

        while(last!=null)
        {
            System.out.print(last.value+" -> ");
            last=last.previous;
        }

        System.out.println("End");

    }

    public void insertAtParticularIndex(int index,int value)
    {

        Node node=new Node(value);

        Node current=head;
        if(index==0)
        {
           addedNodeAtStart(value);
            return;
        }
        for (int i = 0; i <index; i++) {
          current=current.next;
        }

        node.next= current.next;
        node.previous=current;

        current.next.previous=node;
        current.next=node;
    }




    public void addedNodeAtStart(int value)
    {
        Node node=new Node(value);
        size++;
       if(head==null)
       {
         head=node;
         head.previous=null;
         head.next=null;
         tail=head;
           return;
       }
       node.next=head;
       head.previous=node;
       head=node;
    }

    public void addedNodeAtEnd(int value)
    {

        Node node=new Node(value);

        if(tail==null)
        {
            tail=node;
            return;
        }

        tail.next=node;
        node.previous=tail;
        tail=node;

    }



}




class Node {

    int value;
    Node next;
    Node previous;

    public Node(int value) {
        this.value = value;
    }
}
