package hw12Abstraction;


public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	
	//public abstract void chemistry(); -- this is regular class , we cannot declared method.
	//One extends keyword used for the inheritance in java for a regular class by extends keyword but a regular class cannot inherits interface 
	//A regular class use extends only one keyword. but A regular class  inheritace abstract class must be  use with  implement keyword.
	
	// abstract method can not be created in the Class
		/*
		 * public abstract void chemistry();
		 */

	//default method can't be created in regular class
	/*
	public default void al() {
		
	}
	*/
	
	
	// Extends and implements keyword are used for the inheritance in regular class.
	// Regular class can inherit other Regular class by extends key word.
	// Regular class can inherit abstract class by extends key word.
	// Regular class can't inherit Interface by extends key word.
	// Regular class can inherit multiple Interface by implements key word.
	// Regular class can inherit one abstract class or one regular class. One
	// inheritance is possible.

	public void biology() {
		System.out.println("This is from biology non abstract method");
	}
	//yes, and this default constructor below
	public  ColumbiaUniversity() {
		
	}
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void VocationalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}


}
