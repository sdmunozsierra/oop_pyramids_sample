package pyramids;

//This class can inherit Parent_Pyramid and implement its own properties and methods
public class American_Pyramid extends Parent_Pyramid{
	
	//Properties
	String country;
	int size;
	String category = "Has not been set";
	
	/** There are two constructors, so we can choose either of one */
	
	//We create an American pyramid constructor with extra parameters
	/** Constructor 1 that requires an existing pyramid to be built
	 * @param pyramid Existing parent_pyramid
	 * @param country Add a country to the pyramid
	 * @param size Add the size */
	public American_Pyramid(Parent_Pyramid pyramid, String country, int size) {
		super(); //Access empty constructor in Parent_Pyramid

		//Change some properties use Super for Parent class and this for current class
		super.setLocation("America");
		this.country = country;
		super.setMaterial1("Limestone");
		super.setMaterial2("Adobe");
		super.setMaterial3("Stone");
		this.size = size; //The size in m3 

		defineCategory(); //call private method
	}
	
	
	public American_Pyramid(String loc, int bw, int bl, int h, String m1, String m2, String m3){
		
	}

	//To override a method, put the same name but different content
	public void displayInformation() {
		super.displayInformation(); //Override
		System.out.println("-> American Pyramid <-");
		System.out.println("Name: " + super.getName());
		System.out.println("Location: " + super.getLocation());
		System.out.println("Country: " + this.country);
		System.out.println("Materials: " + super.getMaterial1() + " , " + super.getMaterial2() +
				" , " + super.getMaterial3());
		System.out.println("Category: " + this.category);
	}
	
	//Kept as private because the user will not interact with it
	/** Define the pyramid's category 
	 * @return true true if succeed */
	private boolean defineCategory() {
		int size = this.size;
		if (size<100)
			this.category = "Small Pyramid";
		else if(size>101 && size<1000)
			this.category = "Medium Pyramid";
		else if(size>1001)
			this.category = "Giant Pyramid";
		else
			return false;
		return true;
	}

	//For example we can access only this method when using this class
	/** Get the American Pyramid Category */
	public String getCategory(American_Pyramid pyramid) {
		return this.category;
	}
	
	
	
}
