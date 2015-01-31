package com.breeze.topcoder.srm147.div2;

import org.junit.Assert;
import org.junit.Test;

public class PeopleCircleTest {

	PeopleCircle people = new PeopleCircle();

	@Test
	public void testInput0() {
		String expected = "MFMFMFMM";
		String actual = people.order(5, 3, 2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput1() {
		String expected = "FFFMMMMMMM";
		String actual = people.order(7, 3, 1);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput5() {
		String expected = "MMFFM";
		String actual = people.order(3, 2, 9);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput6() {
		String expected = "MFFFM";
		String actual = people.order(2, 3, 9);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput2() {
		String expected = "MMMMMFFFFFFMFMFMMMFFMFFFFFFFFFMMMMMMMFFMFMMMFMFMMF";
		String actual = people.order(25, 25, 1000);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput3() {
		String expected = "MFFMMFFMFM";
		String actual = people.order(5, 5, 3);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput4() {
		String expected = "M";
		String actual = people.order(1, 0, 245);
		Assert.assertEquals(expected, actual);
	}

}
