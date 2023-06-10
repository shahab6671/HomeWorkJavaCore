package hw10Abstraction;

/*
 NursingSchool is abstract child class and MedicalSchool is abstract parant class.
 We can use only one keyword for inheritance in the abstract class.
 We can inheritance abstract class also regular class, but can't used inheritance interface in abstruct class or regular class.
 */

public abstract class MedicalSchool extends NursingSchool {

	public MedicalSchool() {
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is from biochemistryLab non abstract method");

	}

}
