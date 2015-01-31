package com.breeze.topcoder.srm331.div2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.breeze.topcoder.srm331.div2.SantaGifts;

public class SantaGiftsTest {

	SantaGifts santa = new SantaGifts();

	/**
	 * {"ball","plane","robot","puzzle"}, 3 Returns: {"ball puzzle", "plane",
	 * "robot" }
	 *
	 * The first kid gets a ball, the second one a plane, and the third one a
	 * robot. Then the first kid reaches the front of the line again and gets
	 * the last gift.
	 */
	@Test
	public void testSimpleCase0() {
		String[] presents = { "ball", "plane", "robot", "puzzle" };
		String[] actualDistribution = santa.distribute(presents, 3);
		String[] expectedDistribution = { "ball puzzle", "plane", "robot" };

		System.out.println(Arrays.toString(actualDistribution));
		Assert.assertArrayEquals(expectedDistribution, actualDistribution);
	}

	/**
	 * {"ball","plane","robot","puzzle","bike"}, 1 Returns:
	 * {"ball plane robot puzzle" }
	 *
	 * There is only one kid, so he will take the first four presents.
	 */
	@Test
	public void testSimpleCase1() {
		String[] presents = { "ball", "plane", "robot", "puzzle", "bike" };
		String[] actualDistribution = santa.distribute(presents, 1);
		String[] expectedDistribution = { "ball plane robot puzzle" };

		System.out.println(Arrays.toString(actualDistribution));
		Assert.assertArrayEquals(expectedDistribution, actualDistribution);
	}

	/**
	 * {"ball","ball","plane","plane"}, 2 Returns: {"ball plane", "ball plane" }
	 *
	 * In this case Santa Claus is fair and gives a ball and a plane to both
	 * kids.
	 */
	@Test
	public void testSimpleCase2() {
		String[] presents = { "ball", "ball", "plane", "plane" };
		String[] actualDistribution = santa.distribute(presents, 2);
		String[] expectedDistribution = { "ball plane", "ball plane" };

		System.out.println(Arrays.toString(actualDistribution));
		Assert.assertArrayEquals(expectedDistribution, actualDistribution);
	}

	/**
	 * {"ball","plane","robot"}, 2 Returns: {"ball", "plane", "robot", "", "" }
	 *
	 * Unfortunately, not all the kids will get gifts.
	 */
	@Test
	public void testSimpleCase3() {
		String[] presents = { "ball", "plane", "robot" };
		String[] actualDistribution = santa.distribute(presents, 5);
		String[] expectedDistribution = { "ball", "plane", "robot", "", "" };

		System.out.println(Arrays.toString(actualDistribution));
		Assert.assertArrayEquals(expectedDistribution, actualDistribution);
	}
}
