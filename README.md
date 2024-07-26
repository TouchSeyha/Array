# Java SE Most Commonly Used Array Manipulation Techniques

## Explanation

1. **Array Creation**: This involves declaring and initializing arrays. You can create arrays of any data type, including primitives and objects. The first example creates an array of integers with a size of 5, while the second creates an array of strings with initial values.

   ```java
        // Array Creation
        int[] numbers = new int[5];
        String[] names = {"Alice", "Bob", "Charlie"};

        // Array Initialization
        numbers[0] = 4;
        numbers[1] = 20;
        numbers[2] = 10;
        numbers[3] = 90;
        numbers[4] = 30;

2. **Accessing Elements**: Array elements are accessed using their index, which starts at 0. This operation retrieves values from specific positions in the array.

   ```java
   // Accessing Elements
    System.out.println("First Array Numbers: " + numbers[0]);
    System.out.println("Second Array Names: " + names[1]);
    ```

    Expected Output:

    ```java
    First Array Numbers: 4
    Second Array Names: Bob

3. **Modifying Elements**: Similar to accessing, you can modify elements by their index. This assigns new values to specific positions in the array.

    ```java
    // Modifying Elements
    numbers[0] = 40;
    System.out.println("Modified First Array Numbers From 4 to : " + numbers[0]);
    ```

    Expected Output:

    ```java
    Modified First Array Numbers From 4 to : 40

4. **`Array.length()`**: The `length` property gives you the total number of elements in the array. It's useful for iteration and bounds checking.

    ```java
    // Array .Length
    System.out.println("Length of Numbers Array: " + numbers.length);
    ```

    Expected Output:

    ```java
    Length of Numbers Array: 5

5. **Iterating through an Array**: This is a common way to process all elements in an array using a standard `for loop`. It allows you to access both the index and the element.

    ```java
    // Iterating through an Array
    System.out.println("Array Numbers:");
    for (int i = 0; i < numbers.length; i++) 
    {
        System.out.println("[" + numbers[i] + "]")
    }
    ```

    Expected Output:

    ```java
    Array Numbers:
    [40]
    [20]
    [10]
    [90]
    [30]

6. **Enhanced For Loop (for-each)**: Introduced in Java 5, this simplifies iteration when you don't need the index. It's more concise and less error-prone than the standard for loop.

    ```java
    // Enhanced For Loop (for-each)
    System.out.println("Array Names:");
    for (String name : names) 
    {
        System.out.println(name);
    }
    ```

    Expected Output:

    ```java
    Array Names:
    Alice
    Bob
    Charlie
    ```

7. **`Arrays.toString()`**: This method from the Arrays class provides a convenient way to print the contents of an array as a string.

    ```java
    // Arrays.toString() for convert to string
    String numbersString = Arrays.toString(numbers);
    System.out.println("Array Numbers toString: " + numbersString);

    // Get the class of the string to confirm that the array has been converted to a string
    Class<?> numbersStringClass = numbersString.getClass();
    System.out.println("Array Numbers String Class: " + numbersStringClass.getName());
    ```

    Expected Output:

    ```java
    Array Numbers toString: [40, 20, 10, 90, 30]
    Array Numbers String Class: java.lang.String
    ```

8. **`Arrays.sort()`**: This method sorts the array in ascending order. For primitive types, it uses a dual-pivot Quicksort algorithm.

    ```java
    // Array.sort() for sorting
    Arrays.sort(numbers);
    System.out.println("Sorted Array Numbers: " + Arrays.toString(numbers));
    ```

    Expected Output:

    ```java
    Sorted Array Numbers: [10, 20, 30, 40, 90]
    ```

9. **`Arrays.fill()`**: This method assigns the specified value to each element of the array, useful for initializing or resetting arrays.

    ```java
    // Array.fill() for filling
   Arrays.fill(names, 0, 1, "Cool Name");
    System.out.println("Filled Array Names: " + Arrays.toString(names));
    ```

    Expected Output:

    ```java
    Filled Array Names: [Cool Name, Bob, Charlie]
    ```

10. **`Arrays.copyOf()`**: This creates a copy of the original array, optionally allowing you to specify a new length (which can be used to truncate or pad the array).

    ```java
    // Array.copyOf() for copying
        int[] copiedArrayNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array Numbers: " + Arrays.toString(copiedArrayNumbers));
    ```

    Expected Output:

    ```java
    Copied Array Numbers: [10, 20, 30, 40, 90]
    ```

11. **Binary Search**: `Arrays.binarySearch()` performs a binary search on a sorted array, returning the index of the found element or a negative value if not found.

    ```java
    // Binary Search
    int index = Arrays.binarySearch(numbers, 40);
    System.out.println("Index of 40 in Numbers Array: " + index);
    ```

    Expected Output:

    ```java
    Index of 40 in Numbers Array: 3
    ```

12. **Multidimensional Arrays**: Java supports arrays of arrays, allowing you to create matrices or higher-dimensional data structures.

    ```java
    // Multi-Dimensional Array
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Multi-Dimensional Array: " + Arrays.deepToString(matrix));
    ```

    Expected Output:

    ```java
    Multi-Dimensional Array: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    ```

13. **Stream Operations**: Introduced in Java 8, streams provide a more functional approach to array processing, with methods for mapping, filtering, and reducing array data.

    ```java
    // Stream operation (Java8+)
    int sum = Arrays.stream(numbers).sum();
    System.out.println("Sum of Numbers Array: " + sum);
    ```

    Expected Output:

    ```java
    Sum of Numbers Array: 190
    ```
