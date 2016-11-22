package com.zenika.bowlinggame.solution;

public class BowlingGame {

	private final int rolls[];
	private int currentRoll;

	public BowlingGame() {
		rolls = new int[21];
	}

	public void addRoll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int getScore() {
		int score = 0;
		int rollIndex = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (isStrike(rollIndex)) {
				score += 10 + getStrikeBonus(rollIndex);
				rollIndex++;
			} else if (isSpare(rollIndex)) {
				score += 10 + getSpareBonus(rollIndex);
				rollIndex += 2;
			} else {
				score += getFrameScore(rollIndex);
				rollIndex += 2;
			}
		}
		return score;
	}

	private int getSpareBonus(int rollIndex) {
		return rolls[rollIndex + 2];
	}

	private int getStrikeBonus(int rollIndex) {
		final int getStrikebonus = rolls[rollIndex + 1] + getSpareBonus(rollIndex);
		return getStrikebonus;
	}

	private boolean isStrike(int rollIndex) {
		return rolls[rollIndex] == 10;
	}

	private boolean isSpare(int rollIndex) {
		return getFrameScore(rollIndex) == 10;
	}

	private int getFrameScore(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex + 1];
	}

}
