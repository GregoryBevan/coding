package fr.elgregos.factoriel.stream;

import java.util.stream.IntStream;

public class FactorielWithStream {

	public long calc(int i) {
		if (i == 0) {
			return 1;
		}
		return IntStream.rangeClosed(1, i).reduce((x, y) -> x * y).getAsInt();
	}

}
