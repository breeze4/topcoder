package com.breeze.topcoder.srm647.div2;

import org.junit.Assert;
import org.junit.Test;

public class PeacefulLineTest {

	PeacefulLine tbd = new PeacefulLine();

	@Test
	public void testInput0() {
		String expected = "possible";
		String actual = tbd.makeLine(new int[] { 1, 2, 3, 4 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput1() {
		String expected = "impossible";
		String actual = tbd.makeLine(new int[] { 1, 1, 1, 2 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput2() {
		String expected = "possible";
		String actual = tbd.makeLine(new int[] { 1, 1, 2, 2, 3, 3, 4, 4 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput3() {
		String expected = "possible";
		String actual = tbd.makeLine(new int[] { 3, 3, 3, 3, 13, 13, 13, 13 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput4() {
		String expected = "impossible";
		String actual = tbd.makeLine(new int[] { 3, 7, 7, 7, 3, 7, 7, 7, 3 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput5() {
		String expected = "possible";
		String actual = tbd.makeLine(new int[] { 25, 12, 3, 25, 25, 12, 12, 12, 12, 3, 25 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput6() {
		String expected = "possible";
		String actual = tbd.makeLine(new int[] { 3, 3, 3, 3, 13, 13, 13, 13, 3 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput7() {
		String expected = "possible";
		String actual = tbd.makeLine(new int[] { 3, 3, 3, 3, 13, 13, 13, 13, 3, 3, 3, 3, 3, 13, 13, 13, 13, 3, 3, 3,
				13, 13, 13, 13, 3 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput8() {
		String expected = "impossible";
		String actual = tbd.makeLine(new int[] { 13, 13, 3, 3, 13, 13, 13, 13, 3, 3, 3, 3, 3, 13, 13, 13, 13, 3, 3, 3,
				13, 13, 13, 13, 3 });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput9() {
		String expected = "impossible";
		String actual = tbd.makeLine(new int[] { 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25,
				25, 25, 25, 25, 25, 25, 25, 25 });
		Assert.assertEquals(expected, actual);
	}
}
