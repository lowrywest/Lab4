/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
    // Testing the constructor with input
    public void fullConstructorTest() throws AssertException
    {
    	Animal animal = new Animal("Red", "Fox", 10.0, 25.0);
    	// Name should be "Fox", color "Red", height 25.0 and weight 10.0
    	Assert.assertEquals("Red", animal.getColor());
        Assert.assertEquals("Fox", animal.getName());
        Assert.assertEquals(25.0, animal.getHeight(), 0.01);
        Assert.assertEquals(10.0, animal.getWeight(), 0.01);
    	
    }
    // Testing the getName method
    public void getNameTest() throws AssertException
    {
    	Animal animal = new Animal("Red", "Fox", 10.0, 25.0);
    	Assert.assertEquals("Fox", animal.getName());
    }
    // Testing the getColor method
    public void getColorTest() throws AssertException
    {
    	Animal animal = new Animal("Red", "Fox", 10.0, 25.0);
    	Assert.assertEquals("Red", animal.getColor());
    }
    // Testing the getWeight method
    public void getWeightTest() throws AssertException
    {
    	Animal animal = new Animal("Red", "Fox", 10.0, 25.0);
    	Assert.assertEquals(10.0, animal.getWeight());
    }
    // Testing the getHeight method
    public void getHeightTest() throws AssertException
    {
    	Animal animal = new Animal("Red", "Fox", 10.0, 25.0);
    	Assert.assertEquals(25.0, animal.getHeight());
    }
    // Testing the toString method
    public void toStringTest() throws AssertException
    {
    	Animal animal = new Animal("Red", "Fox", 10.0, 25.0);
    	Assert.assertEquals("Fox, a Red-colored animal. 10.0 pounds, 25.0 inches\n", animal.toString());
    }

    // TODO: test full constructor, getters, and toString
}

