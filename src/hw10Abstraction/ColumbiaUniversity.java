package hw10Abstraction;


public class ColumbiaUniversity extends  EngineeringSchool {
	
	//public abstract void chemistry(); -- this is regular class , we cannot declared method.
	//One extends keyword used for the inheritance in java for a regular class by extends keyword but a regular class cannot inherits interface 
	//A regular class use extends only one keyword. but A regular class  inheritace abstract class must be  use with  implement keyword.
	
	
	public void biology() {
		System.out.println("This is from biology non abstract method");
	}
	//yes, and this default constructor below
	public  ColumbiaUniversity() {
		
	}
	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}
	

}
