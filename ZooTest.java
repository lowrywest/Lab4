

public class ZooTest
{
	// Constructing the Animal objects to put in the Zoo
	private Animal one= new Animal("Red", "Fox", 10.0, 25.0);
	private Animal two= new Animal("Brown", "Dog", 85.0, 53.0);
	private Animal three= new Animal("Yellow", "Bird", 5.0, 9.0);
	//Constructing an empty Zoo
	private Zoo idk= new Zoo(4);
	//putting the Animal objects into the Zoo
	public void fill()
	{
		idk.addAnimal(one);
		idk.addAnimal(two);
		idk.addAnimal(three);
	}
	//Testing the getCapacity method
	public void getCapacityTest()throws AssertException
	{	
		Assert.assertEquals(4, idk.getCapacity());
	}
	//Testing the getTotalHeight method
	public void getTotalHeightTest() throws AssertException
	{
		Assert.assertEquals(87.0, idk.getTotalHeight());
	}
	//Testing the toString method
	public void toStringTest() throws AssertException
	{
		Assert.assertEquals("These animals live in the zoo: \nFox, a Red-colored animal. 10.0 pounds, 25.0 inches\n"
		+ "Dog, a Brown-colored animal. 85.0 pounds, 53.0 inches\nBird, a Yellow-colored animal. 5.0 pounds, 9.0 inches\n", idk.toString());
	}

}