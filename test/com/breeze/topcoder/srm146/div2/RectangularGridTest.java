package com.breeze.topcoder.srm146.div2;

import org.junit.Assert;
import org.junit.Test;

public class RectangularGridTest {

	RectangularGrid rect = new RectangularGrid();

	@Test
	public void testInput0() {
		long expected = 22;
		long actual = rect.countRectangles(3, 3);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput1() {
		long expected = 31;
		long actual = rect.countRectangles(5, 2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput2() {
		long expected = 2640;
		long actual = rect.countRectangles(10, 10);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput3() {
		long expected = 0;
		long actual = rect.countRectangles(1, 1);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInput4() {
		long expected = 81508708664L;
		long actual = rect.countRectangles(592, 964);
		Assert.assertEquals(expected, actual);
	}
}
