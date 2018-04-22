package mergeSort;

import java.util.Scanner;

public class mergeSort {

	public static void mergeSort1(int[] A, int p,int r) 
	{
		if(p<r) {
			
			
			int q = ((p+r)/2);
			mergeSort1(A,p,q);
			mergeSort1(A,q+1,r);
			merge(A,p,q,r);
			}
	}
	private static void merge(int[] A, int p, int q, int r) 
	{
		
		int n1 = q - p + 1 ;
		int n2 = r - q;
		int[] left = new int[n1+1];
		int[] right = new int[n2+1];
		for(int j =0; j<n1;j++) 
		{
			left[j]=A[p+j];
		}
		for(int j =0; j<n2;j++) 
		{
			right[j]=A[q+j+1];
		}
		left[n1]=9999999;//a very large no.
		right[n2]=999999;//a very large no.
		int i=0;
		int j=0;
		
		for(int k = p;k<=r;k++) 
		{
			if(left[i]<= right[j]) 
			{
				A[k] = left[i];
				i = i+1;
			}
			else 
			{
				A[k] =right[j];
				j=j+1;
						
			}
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
		//printArr(mergeSort1(array,0,array.length-1));
        
        mergeSort.mergeSort1(array, 0, array.length-1);
 
        System.out.println("\nSorted array");
        printArr(array);

	}
}
