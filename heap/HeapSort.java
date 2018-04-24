package heap;

import java.util.Scanner;
import heap.heap;
public class HeapSort {
	
	
	public static object heapSort(object A) {
		heap.buildMaxHeap(A);
		for(int i=A.Array.length-1;i<1;i--) 
		{
			heap.exchange(A.Array[1], A.Array[i]);
			A.heapsize =A.heapsize-1;
			heap.maxHeapify(A, 1);
		}
		return A;
	}
	
	public static void printArr(int[] a) {
		for(int i=0; i<a.length;i++) {

		System.out.println(a[i]+ " ");
		
	}
		}

	public static void main(String[] args) {
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
        
        object ob = new object(array);
        printArr(heapSort(ob).Array);
	}

}
