import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Array Creation
        int[] numbers = new int[5];
        String[] names = {"Alice", "Bob", "Charlie"};

        // Array Initialization
        numbers[0] = 4;
        numbers[1] = 20;
        numbers[2] = 10;
        numbers[3] = 90;
        numbers[4] = 30;

        // 2. Accessing Elements
        System.out.println("First Array Numbers: " + numbers[0]);
        System.out.println("Second Array Names: " + names[1]);
        
        // 3. Modifying Elements
        numbers[0] = 40;
        System.out.println("Modified First Array Numbers From 4 to : " + numbers[0]);
        
        // 4. Array .Length
        System.out.println("Length of Numbers Array: " + numbers.length);
        
        // 5. Iterating through an Array
        System.out.println("Array Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + numbers[i] + "]");
        }

        // 6. Arrays.toString() for convert to string
        String numbersString = Arrays.toString(numbers);
        System.out.println("Array Numbers toString: " + numbersString);

        // Get the class of the string to confirm that the array has been converted to a string
        Class<?> numbersStringClass = numbersString.getClass();
        System.out.println("Array Numbers String Class: " + numbersStringClass.getName());

        // 7. Array.sort() for sorting
        Arrays.sort(numbers);
        System.out.println("Sorted Array Numbers: " + Arrays.toString(numbers));

        // 8. Array.fill() for filling
        Arrays.fill(names, 0, 1, "Cool Name");
        System.out.println("Filled Array Names: " + Arrays.toString(names));

        // 9. Array.copyOf() for copying
        int[] copiedArrayNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array Numbers: " + Arrays.toString(copiedArrayNumbers));

        // 10. Multi-Dimensional Array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Multi-Dimensional Array: " + Arrays.deepToString(matrix));

        // 11. Stream operation (Java8+)
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of Numbers Array: " + sum);

        // Traditional way
        int sumNum = 0;
        for (int num : numbers) {
            sumNum += num;
        }
        System.out.println("Traditional way Sum of Numbers Array: " + sumNum);

    }
}
