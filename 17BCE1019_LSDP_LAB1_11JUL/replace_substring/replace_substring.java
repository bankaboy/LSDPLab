import java.util.*;

public class replace_substring {  
	public static void main(String args[]) { 
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter main string: ");
		String main = s.nextLine(); 
		System.out.print("Enter string to be replaced: ");
		String oldString = s.nextLine();
		System.out.print("Enter string to replace with: ");
		String newString = s.nextLine(); 
		String replaceString = main.replace(oldString, newString);
		System.out.println(replaceString);  
	}
}  
