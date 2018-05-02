package insertionSort;
//import statements
import java.util.Scanner;

public class InsertionSort {
	
	
	
	public static int[] insertionSort(int[] a) //function to perform insertion Sort
         {
		int key =0;
		int i =0;
		for(int j = 1;j <a.length;j++) {
			
			key = a[j];
			i = j -1;
			while(i>0 && a[i]>key) {
				
				a[i+1] = a[i];
				i = i -1;
				
			}
			a[i+1]=key;
		}
		return a ;
		
		
	}
	
	public static void printArr(int[] a) //function to print the array
        {
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
		for(int i=0; i<n;i++) {
			array[i] = in.nextInt();
		}
		printArr(insertionSort(array));
		
		
	
		
	}

}
