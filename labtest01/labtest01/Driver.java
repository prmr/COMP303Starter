package labtest01;

/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver
{
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	private Driver() {}
	
	/**
	 * @param pArgs Not used
	 */
	public static void main(String[] pArgs)
	{
		for( Item item : ITEMS )
		{
			System.out.println(item.getName());
		}
	}
}
