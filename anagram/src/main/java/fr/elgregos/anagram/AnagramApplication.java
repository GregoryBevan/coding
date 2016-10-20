package fr.elgregos.anagram;

public class AnagramApplication {

	public static void main(String[] args) {
		final AnagramGenerator anagramGenerator = new AnagramGenerator();
		anagramGenerator.printAnagrams(args[0]);

	}

}
