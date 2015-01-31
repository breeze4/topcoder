package com.breeze.topcoder.srm145.div2;

import org.junit.Assert;
import org.junit.Test;

public class ImageDitheringTest {

	ImageDithering imageDithering = new ImageDithering();

	@Test
	public void testCase0() {
		int expected = 24;
		int actual = imageDithering.count("BW", new String[] { "" + //
				"AAAAAAAA", //
				"ABWBWBWA", //
				"AWBWBWBA", //
				"ABWBWBWA", //
				"AWBWBWBA", //
				"AAAAAAAA" });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase1() {
		int expected = 48;
		int actual = imageDithering.count("BW", new String[] { "" + //
				"BBBBBBBB", //
				"BBWBWBWB", //
				"BWBWBWBB", //
				"BBWBWBWB", //
				"BWBWBWBB", //
				"BBBBBBBB" });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase2() {
		int expected = 150;
		int actual = imageDithering.count("ACEGIKMOQSUWY", new String[] { "" + //
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",//
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",//
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",//
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",//
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",//
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX" });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase3() {
		int expected = 0;
		int actual = imageDithering.count("CA", new String[] { "" + //
				"BBBBBBB", //
				"BBBBBBB", //
				"BBBBBBB" });
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCase4() {
		int expected = 4;
		int actual = imageDithering.count("DCBA", new String[] { "ACBD" });
		Assert.assertEquals(expected, actual);
	}
}
