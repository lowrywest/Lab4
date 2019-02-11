
public class EquipmentTest
{
	// Constructing the Equipment object
	private final Equipment USE= new Equipment("Batgun/5, 45.82, 456.23,loves to use in the dark");
		//Testing the constructor to make the object
		public void constructorTest() throws AssertException 
		{
			Assert.assertEquals("Batgun", USE.getName());
			Assert.assertEquals(5, USE.getCount());
			Assert.assertEquals(45.82, USE.getTotalWeight());
			Assert.assertEquals(456.23, USE.getTotalPrice());
			Assert.assertEquals("loves to use in the dark", USE.getDescription());
			
		}
		//Testing the getName method
		public void getNameTest() throws AssertException
		{
			Assert.assertEquals("Batgun", USE.getName());
		}
		//Testing the getCount method
		public void getCountTest() throws AssertException
		{
			Assert.assertEquals(5, USE.getCount());
		}
		//Testing the getTotalWeight method
		public void getTotalWeightTest() throws AssertException
		{
			Assert.assertEquals(45.82, USE.getTotalWeight());
		}
		//Testing the getTotalPrice method
		public void getTotalPriceTest() throws AssertException
		{
			Assert.assertEquals(456.23, USE.getTotalPrice());
		}
		//Testing the getDescription method
		public void getDescriptionTest() throws AssertException
		{
			Assert.assertEquals("loves to use in the dark", USE.getDescription());
		}
		//Testing the toString method
		public void toStringTest() throws AssertException
		{
			Assert.assertEquals("Name: Batgun, Number: 5, Weight: 45.82 lbs, Price: $456.23 - loves to use in the dark", USE.toString());
		}
}