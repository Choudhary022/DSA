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
            list.deleteHead();
            list.displayLinkedList();

        }catch(Exception a)
        {
            System.out.println("error"+a);
        }



    }

    public void addNodeInFront(int value)
    {
        System.out.println("add node in front");
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
        System.out.println("add node in Last");

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

    public void deleteHead() throws Exception
    {
        if(head==null)
        {
             throw new  Exception("Linked List is Empty");
        }
        head=head.next;
    }

    public void deleteTail() throws Exception {
        if(head==null)
        {
            throw new  Exception("Linked List is Empty");
        }

        Node current=head;
        // ley write this later

    }

}

class Node {

    int value;
    Node next;
    public Node(int value){
        this.value=value;
    }
    public Node(int value,Node next)
    {
        this.value=value;
        this.next=next;
    }

}

