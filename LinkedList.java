public class LinkedList{
    Node head;
    class Node{
        int data; Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    // Implementation of Insertion of a node at the end 
    public void InsertionAtEnd(int newData){
        Node NewNode=new Node(newData);

        // LinkedList is empty
        if(head==null){
            head=newNode(newData);
            return;
        }
        // LinkedList is not empty

        NewNode.next=null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=NewNode;
        return;
    }

    private LinkedList.Node newNode(int newData) {
        return null;
    }

    // Implementation of Displaying LinkedList
    public void displayLL(){
        Node current= head;
        while(current!=null){
            System.out.println(current.data +" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList llist=new LinkedList();
        llist.InsertionAtEnd(2);
        llist.InsertionAtEnd(4);
        llist.InsertionAtEnd(8);

        System.out.println("Before insertion of 10");
        llist.displayLL();
        System.out.println();

        llist.InsertionAtEnd(10);
        System.out.println("After insertion of 10");
        llist.displayLL();
        System.out.println();
    }
}
