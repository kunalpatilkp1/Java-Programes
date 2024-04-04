
//Q2:Find maximum sum path involving elements of given arrays
//Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
//We can start from either array, but we can switch between arrays only through its common elements.

//For example,

//Input: X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 }
//Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 }  
//The maximum sum path is: 1 —> 2 —> 3 —> 6 —> 7 —> 9 —> 10 —> 12 —> 15 —> 16 —> 18 —> 100 
//The maximum sum is 199

import java.util.*;	
public class MaximumSum {

	    public static int maximumSumPath(int[] X, int[] Y) {
	        int maxSum = 0;
	        int sumX = 0, sumY = 0;

	        int i = 0, j = 0;
	        int m = X.length, n = Y.length;

	        // Traverse both arrays and find the maximum sum path
	        while (i < m && j < n) {
	            if (X[i] < Y[j]) {
	                sumX += X[i++];
	            } else if (X[i] > Y[j]) {
	                sumY += Y[j++];
	            } else {
	                // Common element found, take maximum sum and reset sumX and sumY
	                maxSum += Math.max(sumX, sumY) + X[i];
	                sumX = 0;
	                sumY = 0;
	                i++;
	                j++;
	            }
	        }

	        // Add remaining elements of X[] if any
	        while (i < m) {
	            sumX += X[i++];
	        }

	        // Add remaining elements of Y[] if any
	        while (j < n) {
	            sumY += Y[j++];
	        }

	        // Add the maximum of remaining sums to maxSum
	        maxSum += Math.max(sumX, sumY);

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        // Example arrays X[] and Y[]
	        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
	        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

	        // Find maximum sum path
	        int maxSum = maximumSumPath(X, Y);

	        // Print the maximum sum path and the maximum sum
	        System.out.println("Maximum sum path: " + maxSum);
	    }
	}


