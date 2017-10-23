package pyramids;

//This will be the parent class
//The other classes will extend this.
public class Parent_Pyramid {
	
	private String location; //General Location
	private int bwidth; 	//Base width
	private int blength;	//Base length
	private int height;		//Height
	private String material1; //Material 1
	private String material2; //Material 2
	private String material3; //Material 3
	
	public String name;  //Protected to be inherited

	
	/** Constructor with parameters to create a general purpose pyramid */
	public Parent_Pyramid (String loc, int bw, int bl, int h, String m1, String m2, String m3){
		this.location = loc;
		this.bwidth = bw;
		this.blength = bl;
		this.height = h;
		this.material1 = m1;
		this.material2 = m2;
		this.material3 = m3;
	}
	
	/* Empty constructor to gain access to this class methods and properties if needed */
	public Parent_Pyramid () {
		//Empty constructor
	}
	
	/** To implement a get size method we have some options */
	
	
	//Method 1: use no parameters
	//This might look like a good idea, but when you extend this class to create an 'American Pyramid"
	//You will not be able to use this method... (without modifying the code)
	/** Get size 1  */
	public int getSize1() {
		int formula = 0;
		formula = (this.blength * this.bwidth * this.height);
		formula /= 3;
		return formula; 
	}
	
	//Method 2: use the pyramid as parameter
	// In difference with method 1, you can use any pyramid and it will do what its told
	/** Get Size 2
	 * @param Parent_Pyramid Insert a pyramid to extract its total size */
	public int getSize2(Parent_Pyramid pyramid){
	
		int formula = 0;
		int baseLength = pyramid.getBlength();
		int baseWidth = pyramid.getBwidth();
		int height = pyramid.getHeight();
		formula = baseLength * baseWidth * height;
		formula /= 3;
		
		return formula;
	}

	//We will leave this method as it is to be [transcribed] in an inherited class
	/** This method will be overridden */
	public void displayInformation() {
		System.out.println("---------INFO--------");
	}
	
	/** Getters and Setters */

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getBwidth() {
		return bwidth;
	}

	public void setBwidth(int bwidth) {
		this.bwidth = bwidth;
	}

	public int getBlength() {
		return blength;
	}

	public void setBlength(int blength) {
		this.blength = blength;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMaterial1() {
		return material1;
	}

	public void setMaterial1(String material1) {
		this.material1 = material1;
	}

	public String getMaterial2() {
		return material2;
	}

	public void setMaterial2(String material2) {
		this.material2 = material2;
	}

	public String getMaterial3() {
		return material3;
	}

	public void setMaterial3(String material3) {
		this.material3 = material3;
	}

	//"Optional" Properties
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
