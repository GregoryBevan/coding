package fr.elgregos.anagram;

public class AnagramGenerator {

	public void printAnagrams(String word) {
		permutation(word);
	}

	// private List<String> generate(String word) {
	// final char[] charArray = word.toCharArray();
	// }

	private void permutation(String str) {
		permutation("", str);
	}

	private void permutation(String prefix, String str) {
		final int n = str.length();
		if (n == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}

}
