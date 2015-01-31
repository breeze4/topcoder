import org.junit.*;

public class DivisorDigitsTest {
	@Test
	public void example0()
	{
		int number = 12345;
		int __expected = 3;
	
		int __result = new DivisorDigits().howMany(number);

		Assert.assertEquals(__expected, __result);
	}

	@Test
	public void example1()
	{
		int number = 661232;
		int __expected = 3;
	
		int __result = new DivisorDigits().howMany(number);

		Assert.assertEquals(__expected, __result);
	}

	@Test
	public void example2()
	{
		int number = 52527;
		int __expected = 0;
	
		int __result = new DivisorDigits().howMany(number);

		Assert.assertEquals(__expected, __result);
	}

	@Test
	public void example3()
	{
		int number = 730000000;
		int __expected = 0;
	
		int __result = new DivisorDigits().howMany(number);

		Assert.assertEquals(__expected, __result);
	}

}
