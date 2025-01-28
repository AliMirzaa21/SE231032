import java.util.Arrays;

public class arrayInsertion {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};


        int elementToInsert = 25;


        int index = 2;


        arr = insertAtIndex(arr, elementToInsert, index);


        System.out.println("Array after insertion: " + Arrays.toString(arr));
    }

    public static int[] insertAtIndex(int[] arr, int element, int index) {
        // Create a new array with length one greater than the original array
        int[] newArr = new int[arr.length + 1];


        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }


        newArr[index] = element;


        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }


        return newArr;
    }
}