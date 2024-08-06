// For an overview of the program and sample inputs, be sure to check out `FindTheSums.md`

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
