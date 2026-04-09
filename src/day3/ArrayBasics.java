package day3;

public class ArrayBasics {
    public static void main(String[] args) {

        // 1. Create array
        int[] arr = {10, 20, 30, 40, 50};

        // 2. Access elements
        System.out.println("First element: " + arr[0]);

        // 3. Access using for loop
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 4. Modify array
        arr[2] = 99;
        System.out.println("Modified element at index 2: " + arr[2]);

        // 5. Length of array
        System.out.println("Length of array: " + arr.length);
    }
}