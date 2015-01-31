package com.breeze.topcoder.srm144.div2;

import org.junit.Assert;
import org.junit.Test;

import com.breeze.topcoder.srm144.div2.Time;

public class TimeTest {

	Time time = new Time();

	@Test
	public void testCase0() {
		int seconds = 0;
		String expected = "0:0:0";
		String actual = time.whatTime(seconds);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase1() {
		int seconds = 3661;
		String expected = "1:1:1";
		String actual = time.whatTime(seconds);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase2() {
		int seconds = 5436;
		String expected = "1:30:36";
		String actual = time.whatTime(seconds);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase3() {
		int seconds = 86399;
		String expected = "23:59:59";
		String actual = time.whatTime(seconds);
		Assert.assertEquals(expected, actual);
	}

}
