//Q1: Merge two arrays by satisfying given constraints
//Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 //merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

//For example,

//Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
//Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
//Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }


import java.util.Arrays;

public class merge {

    public static void mergeArrays(int[] X, int[] Y) {
        // Get the lengths of arrays X[] and Y[]
        int m = X.length;
        int n = Y.length;
        
        // Initialize pointers
        int ptrX = m - n - 1; // Pointer for X[] starting from the last non-vacant cell
        int ptrY = 0;         // Pointer for Y[] starting from the first element
        int ptrMerge = 0;     // Pointer for merging back into X[] starting from the first cell

        // Merge elements of Y[] into X[] in sorted order
        while (ptrX >= 0 && ptrY < n) {
            if (X[ptrX] > Y[ptrY]) {
                // If current element in X[] is greater than current element in Y[], 
                // move it to the correct position in X[]
                X[ptrMerge++] = Y[ptrY++];
            } else {
                // Otherwise, place current element from X[] into X[]
                X[ptrMerge++] = X[ptrX--];
            }
        }

        // If there are still elements remaining in Y[], copy them to X[]
        while (ptrY < n) {
            X[ptrMerge++] = Y[ptrY++];
        }
    }

    public static void main(String[] args) {
        // Example arrays X[] and Y[]
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        // Merge arrays X[] and Y[]
        mergeArrays(X, Y);

        // Print the merged array
        System.out.println("Merged array: " + Arrays.toString(X));
    }
}
