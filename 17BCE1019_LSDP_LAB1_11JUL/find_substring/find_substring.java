import java.util.*;

public class find_substring {
	public static void main (String[] args) { 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter main string: ");
	String input = s.nextLine();
	System.out.println("Enter substring: ");
	String substring = s.nextLine();
	boolean isPresent = input.indexOf(substring) != -1 ? true : false; 
	if (isPresent) { 
		System.out.println("input string: " + input);
		System.out.println("search string: " + substring);
		System.out.println("does String contains substring? " + "YES");
	}
}
}
