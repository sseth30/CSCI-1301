# `FindTheSums.java` Program

>[!IMPORTANT]
The `FindTheSums.java` Java program is designed to work with 2D arrays to find horizontal and vertical sums that match a specified target sum. This lab provides experience with 2D arrays, nested loops, and static methods, while enhancing problem-solving skills.

## Program Description

The program defines a `FindTheSums` class with methods to convert a 2D array to a neatly formatted string and to find horizontal and vertical sums in the array that match a given sum. The sums are then represented in new arrays with the same dimensions as the input array.

## Key Features

- **Methods**: 
  - `arrayToString(int[][] a)`: Converts a 2D array to a formatted string.
  - `horizontalSums(int[][] a, int sumToFind)`: Finds horizontal sums in the array that match the target sum.
  - `verticalSums(int[][] a, int sumToFind)`: Finds vertical sums in the array that match the target sum.

>[!NOTE]
Notice that `FindTheSums.java` takes an input from the `FindTheSumsTester` class and finds the corresponding sum for either the vertical or horizontal components of the respective 2D array. The numbers that are not used are given a value of `0`, and any overlapping is considered when finding the correct sums.
The user may update the arrays via editing `FindTheSumsTester.java` directly, done by changing the two `(2)` arrays used for testing, labeled `array1` and `array2` respectively.

## Demonstration of `FindTheSums.java` correctly implemented
### `FindTheSums.java` (main code) -

```java
public class FindTheSums {

    public static String arrayToString(int[][] a) {
    	// Returns empty String if array is null or empty
        if (a == null || a.length == 0) 
        	return "";
        String result = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            	// Appends the elements to the resultant String
                result += a[i][j];
                if (j < a[i].length - 1) {
                    result += " ";
                }
            }
            if (i < a.length - 1) {
                result += "\n";
            }
        }
        return result;
    }

    public static int[][] horizontalSums(int[][] a, int sumToFind) {
    	// Initialize the output array with 'a'
        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int sum = 0;
                for (int k = j; k < a[i].length && sum < sumToFind; k++) {
                	// Sum up the arrays until it reaches the target
                    sum += a[i][k];
                    if (sum == sumToFind) {
                        for (int l = j; l <= k; l++) {
                        	// If it matches, copy to array
                            b[i][l] = a[i][l];
                        }
                    }
                }
            }
        }
        return b;
    }

    public static int[][] verticalSums(int[][] a, int sumToFind) {
    	// Initialize the output array with 'a'
        int[][] b = new int[a.length][a[0].length];
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                int sum = 0;
                for (int k = i; k < a.length && sum < sumToFind; k++) {
                	// Sum up the arrays until it reaches the target
                    sum += a[k][j];
                    if (sum == sumToFind) {
                        for (int l = i; l <= k; l++) {
                        	// If it matches, copy to array
                            b[l][j] = a[l][j];
                        }
                    }
                }
            }
        }
        return b;
    }
}
```

### `FindTheSumsTester.java` (output) -

```java
Testing arrayToString method:
arrayToString(array1) test passed
arrayToString(array2) test passed

Testing horizontalSums method:
array1:
3 2 1 1
2 5 6 2
1 2 9 8
horizontalSums(array1, 7):
3 2 1 1
2 5 0 0
0 0 0 0
array2:
7 3 8 5 6 7 4 1 9 5
8 1 6 1 8 4 6 9 9 6
9 2 4 8 6 1 1 3 6 2
3 6 8 3 1 9 2 7 9 6
5 7 7 6 3 5 6 4 2 1
6 4 5 5 7 6 8 1 9 7
8 4 5 4 3 7 1 2 1 8
6 8 6 7 8 6 2 4 6 2
7 8 6 8 3 8 2 2 8 5
8 7 7 6 6 2 9 9 5 8
horizontalSums(array2, 20):
0 0 0 0 0 0 0 0 0 0
0 1 6 1 8 4 0 0 0 0
0 2 4 8 6 1 1 0 0 0
3 6 8 3 0 0 0 0 0 0
0 7 7 6 3 5 6 4 2 0
6 4 5 5 0 0 0 0 0 0
0 0 5 4 3 7 1 0 0 0
6 8 6 0 8 6 2 4 6 2
0 0 0 0 0 8 2 2 8 0
0 7 7 6 0 2 9 9 0 0
horizontalSums(array2, 25):
0 0 0 0 0 0 0 0 0 0
0 0 6 1 8 4 6 0 0 0
0 2 4 8 6 1 1 3 6 0
0 0 0 0 0 0 0 0 0 0
5 7 7 6 0 0 0 0 0 0
0 0 0 0 0 0 8 1 9 7
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 8 6 8 3 8 2 2 8 5
0 0 0 0 0 2 9 9 5 0

Testing verticalSums method:
array1:
3 2 1 1
2 5 6 2
1 2 9 8
verticalSums(array1, 22):
0 0 0 0
0 0 0 0
0 0 0 0
array2:
7 3 8 5 6 7 4 1 9 5
8 1 6 1 8 4 6 9 9 6
9 2 4 8 6 1 1 3 6 2
3 6 8 3 1 9 2 7 9 6
5 7 7 6 3 5 6 4 2 1
6 4 5 5 7 6 8 1 9 7
8 4 5 4 3 7 1 2 1 8
6 8 6 7 8 6 2 4 6 2
7 8 6 8 3 8 2 2 8 5
8 7 7 6 6 2 9 9 5 8
verticalSums(array2, 14):
0 0 8 5 6 0 0 0 0 0
0 0 6 1 8 4 0 0 0 6
0 0 0 8 6 1 0 3 0 2
3 0 0 3 1 9 0 7 0 6
5 0 0 6 3 5 6 4 0 1
6 0 0 5 7 0 8 1 0 7
8 0 0 0 3 0 1 2 0 0
6 0 0 0 8 6 2 0 6 0
0 0 0 8 3 8 2 0 8 0
0 0 0 6 0 0 9 0 0 0
verticalSums(array2, 33):
0 0 8 0 0 0 0 1 9 0
0 0 6 0 0 0 0 9 9 0
0 0 4 8 0 0 0 3 6 0
0 0 8 3 0 9 0 7 9 0
0 0 7 6 0 5 0 4 2 0
0 0 0 5 0 6 0 1 9 0
0 0 0 4 0 7 0 2 1 0
0 0 0 7 0 6 0 4 6 0
0 0 0 8 0 0 0 2 0 0
0 0 0 0 0 0 0 0 0 0
```
