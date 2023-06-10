package hw9Abstraction;

public abstract class MedicalSchool {
	// yes, and this default constructor below
	public MedicalSchool() {

	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is from biochemistryLab non abstract method");

	}

}
