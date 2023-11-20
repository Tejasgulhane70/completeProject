package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "tejas";
		String s2 = "ejsa";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s1.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		int i;
		if (s1.length() == s2.length()) {
			for (i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					break;
				}

			}

			if (i == ch1.length) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}
		} else {
			System.out.println("not anagram");
		}

	}
}
