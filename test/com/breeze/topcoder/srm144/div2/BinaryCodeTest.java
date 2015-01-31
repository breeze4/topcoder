package com.breeze.topcoder.srm144.div2;

import org.junit.Assert;
import org.junit.Test;

public class BinaryCodeTest {

	BinaryCode bc = new BinaryCode();

	@Test
	public void testInput0() {
		String[] actual = bc.decode("123210122");
		String[] expected = { "011100011", "NONE" };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testInput1() {
		String[] actual = bc.decode("11");
		String[] expected = { "01", "10" };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testInput2() {
		String[] actual = bc.decode("22111");
		String[] expected = { "NONE", "11001" };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testInput3() {
		String[] actual = bc.decode("123210120");
		String[] expected = { "NONE", "NONE" };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testInput4() {
		String[] actual = bc.decode("3");
		String[] expected = { "NONE", "NONE" };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testInput5() {
		String[] actual = bc.decode("12221112222221112221111111112221111");
		String[] expected = { "01101001101101001101001001001101001", "10110010110110010110010010010110010" };
		Assert.assertArrayEquals(expected, actual);
	}

}
