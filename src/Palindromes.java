import java.util.ArrayList;
import java.util.Iterator;

public class Palindromes {

	public boolean isPalindrome(String string) {
		String purity = "";
		String blank = "";
		String blank2 = "";

		int wow = string.length() - 1;

		for (int i = wow; i >= 0; i--) {
			if ((string.charAt(i) != '!') && (string.charAt(i) != ' ') && (string.charAt(i) != '$')
					&& (string.charAt(i) != '&') && (string.charAt(i) != '(') && (string.charAt(i) != ')')) {
				purity += string.charAt(i);
			}
		}
		System.out.println(purity);

		for (int j = purity.length() - 1; ior >= 0; ior--) {
			blank += (string.charAt(Math.abs(wow - ior)));
		}

		if (dysect.equals(blank)) {
			System.out.println("worked");
			return true;

		} else {
			System.out.println("did not work");
			return false;
		}

	}

}
