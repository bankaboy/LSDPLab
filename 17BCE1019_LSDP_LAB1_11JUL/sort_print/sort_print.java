import java.util.*;

public class sort_print {
	public static void main (String[] args) {
		String[]  strings = new String[10];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n = s.nextInt();
		for (int i=0;i<n;i++) {
			System.out.print("Enter string "+(i+1)+": ");
			strings[i] = s.next();
		}
		
		System.out.println("Before Sorting");
		for (int i=0;i<n;i++) {
			System.out.println(strings[i]);
		}
		int len  = strings.length;
		for(int i = 0; i<len-1; i++) {
			String line = strings[i];
			int stringLen = line.length;
        	for (int j = i+1; j<stringLen; j++) {
        	    if(strings[i].compareTo(strings[j])>0) {
        	       String temp = strings[i];
        	       strings[i] = strings[j];
        	       strings[j] = temp;
        	    }
        	}
      	}
      	System.out.println("After Sorting");
		for (int i=0;i<n;i++) {
			System.out.println(strings[i]);
		}
	}
}
