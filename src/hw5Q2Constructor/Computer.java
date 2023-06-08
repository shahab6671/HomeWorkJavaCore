package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int madeInYear;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// This is default constructor
	public Computer() {
		System.out.println("This Constructor is from computer class");
	}

	public Computer(String brand, String model, String operatingSystem) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
	}

	//This is parameter constructor.
	public Computer(String band, String model, String operatingSystem,int madeInYear, int price, char grade, boolean madeInUSA) {
		this.brand = band;
		this.model =model;
		this.operatingSystem = operatingSystem;
		this.madeInYear= madeInYear;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("\nBrand name " + band + "\nModel " + model + "\nOperating system is "+ operatingSystem + "\nComputer made in year" + madeInYear+ "\nCompuer price " + price + "\nGrade " + grade
				+ " \nMaden in USA " + madeInUSA);

	}
}

	
