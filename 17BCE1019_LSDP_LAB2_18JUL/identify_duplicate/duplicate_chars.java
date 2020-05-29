import java.util.*;

public class duplicate_chars {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = s.nextLine();
		char[] strArray = str.toCharArray();
		int len = strArray.length;
		int[] visited = new int[len];
		
		// Array to check if element is visited
		for (int i=0;i<len;i++)
			visited[i] = 0;
			
		for (int i=0;i<len;i++) {
			for (int j=i+1;j<len;j++) {
				if (strArray[j]==strArray[i] && visited[i]==0) {
					System.out.println("Found duplicate character : "+strArray[i]);
					visited[i]=1;
					visited[j]=1;
				} else 
					continue;
			}
		}
		
		for (int i = 0;i<len;i++)
			System.out.print(strArray[i]);
			
	}
}
