import java.util.Stack;
public class stackarr {
    public static void main(String[] args) {
        Stack<Integer> newstack = new Stack<>();
        newstack.push(30);
        newstack.push(20);
        newstack.push(25);
        newstack.push(40);

        System.out.println("stack after pushes: " + newstack);

        int peekelement = newstack.peek();
        System.out.println("peek element: " + peekelement);


        int popelement = newstack.pop();
        System.out.println("stack after pop: " + popelement);

        boolean isEmpty = newstack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);


        if (newstack.size() >= 2) {
            int secondelemnt = newstack.get(2);
            System.out.println("second element is: " + secondelemnt);
        }

        if (newstack.size() > 2) {
            newstack.set(2, 22);
            System.out.println("Stack after setting the 3rd element: " + newstack);
        } else {
            System.out.println("The stack does not have enough elements to set the 3rd element.");
        }
    }
}