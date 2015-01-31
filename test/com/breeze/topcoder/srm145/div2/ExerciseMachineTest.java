package com.breeze.topcoder.srm145.div2;

import org.junit.Assert;
import org.junit.Test;

public class ExerciseMachineTest {

	ExerciseMachine tbd = new ExerciseMachine();

	@Test
	public void testCase0() {
		int expected = 99;
		int actual = tbd.getPercentages("00:30:00");
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase1() {
		int expected = 19;
		int actual = tbd.getPercentages("00:28:00");
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase2() {
		int expected = 0;
		int actual = tbd.getPercentages("23:59:59");
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase3() {
		int expected = 49;
		int actual = tbd.getPercentages("00:14:10");
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase4() {
		int expected = 3;
		int actual = tbd.getPercentages("00:19:16");
		Assert.assertEquals(expected, actual);
	}
}
