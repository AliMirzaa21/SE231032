public class QueueByArray {
    static class Queue {
        int arr[];
        int size;
        int front;
        int rear;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            front = 0;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear < front;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            arr[++rear] = data;
        }


        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front++];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.add(0);
        System.out.println("Is queue empty: "+ q.isEmpty());
        System.out.println("Peek element in queue: "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
