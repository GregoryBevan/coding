package com.zenika.bowlinggame.solution;

import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

public class BownlingGameTest {

	private BowlingGame game;

	@Before
	public void setup() {
		game = new BowlingGame();
	}

	@Test
	public void gutter_game_score_is_0() {
		rollManyTimes(20, 0);
		assertEquals(0, game.getScore());
	}

	@Test
	public void game_score_is_20_for_1_pin_at_each_roll() {
		rollManyTimes(20, 1);
		assertEquals(20, game.getScore());
	}

	@Test
	public void game_score_with_one_spare() {
		rollSpare();
		game.addRoll(3);
		rollManyTimes(17, 0);
		assertEquals(16, game.getScore());
	}

	@Test
	public void game_score_with_one_strike() {
		rollStrike();
		game.addRoll(3);
		game.addRoll(4);
		rollManyTimes(17, 0);
		assertEquals(24, game.getScore());
	}

	@Test
	public void game_score_with_only_strikes() {
		rollManyTimes(12, 10);
		assertEquals(300, game.getScore());
	}

	@Test
	public void game_score_with_only_strikes_but_spare_for_last() {
		rollManyTimes(11, 10);
		game.addRoll(3);
		assertEquals(293, game.getScore());
	}

	private void rollStrike() {
		game.addRoll(10);
	}

	private void rollSpare() {
		game.addRoll(5);
		game.addRoll(5);
	}

	private void rollManyTimes(int times, int pins) {
		IntStream.rangeClosed(1, times).forEach(r -> game.addRoll(pins));
	}
}
