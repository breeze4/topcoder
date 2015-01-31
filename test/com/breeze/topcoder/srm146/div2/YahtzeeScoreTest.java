package com.breeze.topcoder.srm146.div2;

import org.junit.Assert;
import org.junit.Test;

public class YahtzeeScoreTest {

	YahtzeeScore score = new YahtzeeScore();

	@Test
	public void testInput0() {
		int expected = 5;
		int actual = score.maxPoints(new int[] { 2, 2, 3, 5, 4 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput1() {
		int expected = 6;
		int actual = score.maxPoints(new int[] { 6, 4, 1, 1, 3 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput2() {
		int expected = 10;
		int actual = score.maxPoints(new int[] { 5, 3, 5, 3, 3 });
		Assert.assertEquals(expected, actual);
	}
}
