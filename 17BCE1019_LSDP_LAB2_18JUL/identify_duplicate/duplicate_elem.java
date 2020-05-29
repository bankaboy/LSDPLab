import java.util.*;

public class duplicate_elem {
	public static void main (String[] args) {
	    int[] array = new int[10];
	    int[] visited = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int count = s.nextInt();
		
		for (int i=0;i<count;i++)
			array[i] = s.nextInt();
			
		// Array to check if element is visited
		for (int i=0;i<count;i++)
			visited[i] = 0;
			
		for (int i=0;i<count;i++) {
			for (int j=i+1;j<count;j++) {
				if (array[j]==array[i] && visited[i]==0) {
					System.out.println("Found duplicate character : "+array[i]);
					visited[i]=1;
					visited[j]=1;
				} else 
					continue;
			}
		}
	}
}
