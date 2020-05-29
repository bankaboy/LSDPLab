import java.util.*;

public class remove_whitespaces {
	public static void main (String[] args) {
		String str1 ;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		str1 = s.nextLine();
		char[] str1Array = str1.toCharArray();
		int len = str1Array.length;
		char[] str2Array = new char[len];
		for (int i=0;i<len;i++) {
			if (str1Array[i] == ' ')
				continue;
			str2Array[i] = str1Array[i];
		}
		for (int i=0;i<len;i++) 
			System.out.print(str2Array[i]);
		
		//str1 = str1.replaceAll("\\s+","");
		//System.out.println("String after removing all the whitespaces: "+str1);
	}
}
