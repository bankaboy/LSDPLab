import java.util.*;

public class reverse_number {
	public static void main (String[] args) {
		int number, temp, reverse = 0, digit;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number: ");
		number = s.nextInt();
		temp = number;
		while (number>0) {
			digit = number%10;
			reverse = reverse*10+digit;
			number = number/10;
		}
		System.out.println("The reverse of "+temp+" is "+reverse);
	}
}
