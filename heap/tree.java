package heap;

public class tree {
	
	
	public static int parent(int i) {
		return (i/2);
	}
	public static int Left(int i) {
		
		return 2*i;
	}
    public static int Right(int i) {
		
		return (2*i+1);
	}
	
}