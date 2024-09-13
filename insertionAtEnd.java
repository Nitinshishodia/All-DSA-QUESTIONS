import java.util.LinkedList;

public class insertionAtEnd {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    // Implementation of Insertion of a node at the end
    public void insertionAtEnd(int newData){
        Node newNode=new Node(newData);

        // linkedList is empty
        if(head==null){
            head=new Node(newData);
            return;
        }
        // linkedList is not empty
        newNode.next=null;
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }

    // implementation of displaying the linkedlist
    public void displayLL(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data +"");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList llist=new LinkedList();
        llist.insertionAtEnd(2);
        llist.insertionAtEnd(4);
        llist.insertionAtEnd(8);
        System.out.println("Before insertion of 10");
        llist.displayLL();
        System.out.println();

        llist.insertAtEnd(10);
        System.out.println("After insertion of 10");
        llist.displayLL();
        System.out.println();

    }
}
