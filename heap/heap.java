package heap;
import heap.tree;

public class heap {
		
        public  static void exchange(int a, int b) {
        	int k =0;
        	a = k;
        	a = b;
        	b = k;
        	
        	
        }	
	public static void maxHeapify(int[] A, int i) {
		int largest;
		int l = tree.Left(i);
		int r = tree.Right(i);
		if(l <= A.length && A[l] > A[i] ) {
			largest = l;
		}
		else 
		{
			largest = r;
		}
		if(r <= A.length && A[r] > A[largest] ) {
			largest = r;
			
		}
		if (largest != i ) {
			exchange(A[i],A[largest]);
			maxHeapify(A,largest);
		}
		
		
	}
	
	public static int[] buildMaxHeap(int[] A){
		for(int i = (A.length-1)/2 ;i>=0;i--) {
			
			maxHeapify(A,i);
			
		}
		
		return A;
	}
	
    
	
	

}
