package pyramids;

public class main {

	public static void main(String[] args) {
		
		
		//General Pyramid information
		String loc = "Asia"; //This is the continent
		int bw = 20; //base width in meters
		int bl = 24; //base length in meters
		int height = 55; //length in meters
		String m1 = "Stone";
		String m2 = "Limestone";
		String m3 = "Wood";
		
		/** To create a general pyramid you can do the following:
		 * This will give you access to all the methods held in Parent_Pyramid Class */
		Parent_Pyramid generalpyramid = new  Parent_Pyramid(loc, bw, bl, height, m1, m2, m3); 
		
		//We have access to all information using get methods
		System.out.println("Pyramid location: "+ generalpyramid.getLocation());
		System.out.println("Pyramid Height: "+ generalpyramid.getHeight());
		System.out.println("Pyramid material 1: "+ generalpyramid.getMaterial1());
		
		/* Now we can do some fancy stuff with our general pyramid */
		
		//Inheritance gives us the power of using parent's class methods and properties
		
		//Setting a name for our pyramid and then extracting it (notice that we did not input
		//the name at the object creation). This can be useful if we are adding custom or optional properties.
		generalpyramid.setName("Piramide de la Luz");
		System.out.println(generalpyramid.getName());
		
		System.out.println("Get Total Size in M3 using two approaches: ");
		//Use method getSize1 (See parent class for comments) 
		System.out.println("Method 1 -> Total Size is: "+ generalpyramid.getSize1());
		
		//Use method 2 and we should obtain the same result
		System.out.println("Method 2 -> Total Size is: "+ generalpyramid.getSize2(generalpyramid));

		//As you can see we can obtain the same with different approaches 

		/** We can create a more specific version of a pyramid */
		American_Pyramid piramide = new American_Pyramid(generalpyramid, "Mexico", generalpyramid.getSize1());
		System.out.println("\nYou have created an American Pyramid out of the Parent Pyramid");
		System.out.println("\nNow see that automatically it has changed the information of the pyramid that we build earlier");
		
		piramide.displayInformation();
		
		System.out.println(piramide.getName());
		System.out.println(generalpyramid.getName());

	}

}
