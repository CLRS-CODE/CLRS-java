package MaximumSubArray;

import java.util.Scanner;
import MaximumSubArray.subArraySum;
import mergeSort.mergeSort;

public class maximumSubArray {
	
    private static subArraySum findMaxCrossingSubArray(int[] A, int low, int mid, int high) {
        int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
        int leftSum = 0, rightSum = 0;
        int left = mid, right = mid + 1;

        for (int i = mid; i >= low; i--) {
            leftSum += A[i];
            if (leftSum > leftMax) {
                leftMax = leftSum;
                left = i;
            }
        }

        for (int i = mid + 1; i <= high; i++) {
            rightSum += A[i];
            if (rightSum > rightMax) {
                rightMax = rightSum;
                right = i;
            }
        }
       subArraySum ob= new subArraySum(left, right, leftMax + rightMax);
       return ob;
    }

    public static subArraySum findMaxSubArray(int[] A, int low, int high) {
        if (low == high) {
        	subArraySum ob=  new subArraySum(low, high, A[low]);

            return ob;
        }
        int mid = (low + high) / 2;
        subArraySum leftMax = findMaxSubArray(A, low, mid);
        subArraySum rightMax = findMaxSubArray(A, mid + 1, high);
        subArraySum crossingMax = findMaxCrossingSubArray(A, low, mid, high);

        if (leftMax.getSum() >= rightMax.getSum() && leftMax.getSum() >= crossingMax.getSum()) {
            return leftMax;
        } else if (rightMax.getSum() >= leftMax.getSum() && rightMax.getSum() >= crossingMax.getSum()) {
            return rightMax;
        } else {
            return crossingMax;
        }

}
    public static void printArr(int[] a) 
	{
		for(int i=0; i<a.length;i++) 
		{

		System.out.print(a[i]+ " ");
		
	    }
    }
    
    public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the length of the array ");
		int n = in.nextInt();
		int[] array = new int[n];
		System.out.println("enter the numbers of the array");
		for(int i=0; i<n;i++) 
		{
			array[i] = in.nextInt();
		}
		System.out.println("Given Array");
        printArr(array);        
 
        System.out.println("\nSorted array");
        printArr(array);
        findMaxSubArray(array,0,array.length-1);
        
	}
    
//    findMaxSubArray(array,0,array.length-1);
    
    
    
}
