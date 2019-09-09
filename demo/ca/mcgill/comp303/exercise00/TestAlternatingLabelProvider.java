package ca.mcgill.comp303.exercise00;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the AlternatingLabelProvider.
 */
public class TestAlternatingLabelProvider
{
	private static final String LABEL_1 = "AAA";
	private static final String LABEL_2 = "BBB";
	
	private AlternatingLabelProvider aFixture;
	
	/**
	 * Initializes the test fixture.
	 */
	@Before
	public void setup()
	{
		aFixture = new AlternatingLabelProvider(LABEL_1, LABEL_2);
	}
	
	/**
	 * Tests the entire class.
	 */
	@Test
	public void testAll()
	{
		assertEquals(LABEL_1, aFixture.getLabel(true));
		assertEquals(LABEL_2, aFixture.getLabel(false));
		assertEquals(LABEL_1 + " " + LABEL_2, aFixture.getBoth());
	}
}
