public class stackl {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     static class stack {
        public static Node head;
         public static boolean isempty(){
             return head == null;
         }

         public static void push(int data) {
             Node newNode = new Node(data);
             if (isempty()) {
                 head = newNode;
             }
             newNode.next = head;
             head = newNode;
         }


     }
     }
