public class LinkedListTail {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;
    Node tail;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node Currentnode = head;
            while (Currentnode.next != tail) {
                Currentnode = Currentnode.next;
            }
            Currentnode.next = null;
            tail = Currentnode;
        }
    }

    public void deletefirst(){
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        }
        else{
            Node Currentnode=head;
            head=head.next;
            Currentnode=null;
        }

    }
    public void displaylist(){
        Node CurrentNode=head;
        while (CurrentNode!=null){
            System.out.print("-->"+CurrentNode.data);
            CurrentNode=CurrentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListTail list=new LinkedListTail();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.displaylist();

        list.deletefirst();
        list.displaylist();

        list.deletelast();
        list.displaylist();

    }
}