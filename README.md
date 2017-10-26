# Sample Code for Inheritance Activity

Object Oriented Programing (OOP) Sample code for Inheritance and Polymorphism with Pyramids exercise

## This Repository

There are three files included in the repository.
1. main.java - Class that contains the main program and general examples on how to create and call the other classes.

	Notice that piramide is showing the name as null. This is a bug and you should fix it.	

2. Parent_Pyramid.java - Class that contains the general scheme to build a pyramid. All Continental pyramids must extend this class.
3. American_Pyramid.java - Class that contains specific requirements to build an American pyramid, it extends Parent_Pyramid.java

The code is well commented, any questions about it can be posted as an issue here at github.
Feel free to fork, clone or download.

## Tasks

You must implement the following:

1. Fix the name bug. (No hints here)
2. Create getters and setters for country and category and modify piramide.
3. Create another American Pyramid using the given class. It does not have to be real but it needs to have all the infomation fields filled.
4. An Asian Pyramid class that will extend Parent_Pyramid.java (Follow the steps from American_Pyramid.java)
It must include:
	1. Extension of Parent_Pyramid.java
	2. Use the following materials: Clay and Stone. 

		* Notice that superclass contains 3 materials. Hint override displayInformation() to show only two materials and set third to null.
	
	3. Add private fields: String Country and boolean locatedinchina.
	4. Create the White Pyramid from your new created class from scratch and display all the variables information. Hint: Google pyramid's information.

		* Do not create a Parent Pyramid, this will demonstrate the power of inheritance.

	5. Create a second pyramid (real or not) that utilizes all the variables and display the information.
5. Make a copy of any pyramid and edit the original. Display that only the original changed but not the copy.
6. Implement a clearPyramid method which will set all the variables to null. Then use it to delete all pyramids but the copy and test that copy is not cleared.  
