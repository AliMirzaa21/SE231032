class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //Add first function
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    
    //Add last function
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next!= null){
            last = last.next;
        }
        last.next = newNode;
    }
    
    //delete first function
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    
    //delete last function
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next!= null){
            current = current.next;
        }
        current.next = null;
    }
    
    
    //print list
    public void printList(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.addFirst("A");
        linkedList.addFirst("B");
        linkedList.addLast("C");
        linkedList.printList();

        linkedList.deleteFirst();
        linkedList.printList();

        linkedList.deleteLast();
        linkedList.printList();
    }
}




        