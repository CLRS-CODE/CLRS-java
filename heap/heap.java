package heap;
import heap.tree;
import heap.object;


public class heap {
		
        public  static void exchange(int a, int b) {
        	int k =0;
        	a = k;
        	a = b;
        	b = k;
        	
        	
        }
        
	public static void maxHeapify(object A, int i) {
		int largest;
		int l = tree.Left(i);
		int r = tree.Right(i);
		if(l <= A.heapsize && A.Array[l] > A.Array[i] ) {
			largest = l;
		}
		else 
		{
			largest = r;
		}
		if(r <= A.heapsize && A.Array[r] > A.Array[largest] ) {
			largest = r;
		}
		if (largest != i ) {
			exchange(A.Array[i],A.Array[largest]);
			maxHeapify(A,largest);
		}
		
		
	}
	
	public static object buildMaxHeap(object A){
        A.heapsize = A.Array.length;
		for(int i = (A.Array.length-1)/2 ;i>=0;i--) {
			
			maxHeapify(A,i);
			
		}
		
		return A;
	}
	
    
	
	

}
