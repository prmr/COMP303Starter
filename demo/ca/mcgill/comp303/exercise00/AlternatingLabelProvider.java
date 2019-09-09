package ca.mcgill.comp303.exercise00;

/**
 * Provides one of two pre-selected labels.
 */
public class AlternatingLabelProvider
{
	private final String label1;
	private final String aLabel2;
	
	/**
	 * Initializes the two labels.
	 * @param pLabel1 The first label. 
	 * @param pLabel2 The second label.
	 * @pre pLabel1 != null && pLabel2 != null;
	 */
	public AlternatingLabelProvider(String pLabel1, String pLabel2) {
		assert pLabel1 != null && pLabel2 != null;
		label1 = pLabel1;
		aLabel2 = pLabel2;
	}
	
	/**
	 * Returns one of the two labels as controlled by the parameter.
	 * @param pLabel True to return the first label, false otherwise.
	 * @return The selected label.
	 * @post return != null
	 */
	public String getLabel(boolean pLabel)
	{
		if( pLabel )
		{
			return label1;
		}
		else
		{
			return aLabel2;
		}
	}
	
	/**
	 * @return Both labels separated by a space.
	 */
	public String getBoth()
	{
		return label1 + " " + aLabel2;
	}
}
