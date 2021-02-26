import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input_str = in.nextLine();

		if (isPalindrome(input_str) == true) {
			System.out.println("Это палиндром");
		} else {
			System.out.println("Это не палиндром");
		}
		in.close();
	}

	public static String reverseString(String s) {
		String str = "";
		for (int i = s.length(); i > 0; i--) {
			str += s.charAt(i - 1);
		}
		return str;
	}

	public static boolean isPalindrome(String s) {
		if (s.equals(reverseString(s)) == true) {
			return true;
		} else {
			return false;
		}
	}
}
