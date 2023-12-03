package linkedList;

public class SinglyLinkedList {

   Node head;
    Node tail;
    public static void main(String[] args)  {

        try {
            SinglyLinkedList list = new SinglyLinkedList();
            list.addNodeInFront(10);
            list.addNodeInFront(20);
            list.addNodeInFront(25);
            list.addNodeInLast(100);
            list.addNodeInLast(150);
            list.addNodeInLast(300);
            list.displayLinkedList();
            System.out.println(list.deleteAnyNode(300));
            list.displayLinkedList();;

        }catch(Exception a)
        {
            System.out.println("error"+a);
        }

    }

    public void addNodeInFront(int value)
    {
        Node node=new Node(value);

        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }

    }

    public void addNodeInLast(int value)
    {
      Node node=new Node(value);

      Node current=head;

        if(tail==null)
        {
            tail=node;
            return;
        }

        while(current.next!=null)
        {
            current=current.next;
        }

        current.next=node;
        tail=node;
    }

    public void displayLinkedList(){

        System.out.println("Displaying Linked List");


       Node current =head;

        while(current!=null)
        {
            System.out.print(current.value+" -> ");
            current=current.next;
        }
        System.out.println("End");

    }

    public int deleteHeadNode() throws Exception
    {
        int value=head.value;
        if(head==null)
        {
            tail=null;
            throw new  Exception("Linked List is Empty");
        }
        head=head.next;
        return value;
    }

    public int  deleteTailNode() throws Exception {

        int value=0;
        if(head==null)
        {
            throw new  Exception("Linked List is Empty");
        }

      Node current=head;

       Node previous=current;

        while(current.next!=null)
        {
          previous=current;
          current=current.next;
          value=current.value;
        }

        previous.next=null;


        return value;
    }


    public int deleteAnyNode(int value)
    {

        Node current=head;

        Node previous=null;
        while(current.value!=value)
        {
            previous=current;
            current=current.next;
        }

        previous.next=current.next;

        return value;
    }

}

class Node {

    int value;
   Node next;
    public Node(int value){
        this.value=value;
    }
    public Node(int value, Node next)
    {
        this.value=value;
        this.next=next;
    }

}

