package com.breeze.topcoder.srm147.div2;

import org.junit.Assert;
import org.junit.Test;

public class CCipherTest {

	CCipher cCipher = new CCipher();

	@Test
	public void testInput0() {
		String expected = "TOPCODER";
		String actual = cCipher.decode("VQREQFGT", 2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput1() {
		String expected = "QRSTUVWXYZABCDEFGHIJKLMNOP";
		String actual = cCipher.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput2() {
		String expected = "TOPCODER";
		String actual = cCipher.decode("TOPCODER", 0);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput3() {
		String expected = "AXCHMA";
		String actual = cCipher.decode("ZWBGLZ", 25);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput4() {
		String expected = "CAMOBAP";
		String actual = cCipher.decode("DBNPCBQ", 1);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput5() {
		String expected = "HELLOWORLD";
		String actual = cCipher.decode("LIPPSASVPH", 4);
		Assert.assertEquals(expected, actual);
	}

}
