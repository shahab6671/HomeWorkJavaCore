package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingsystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// This is default constructor
	public Computer() {
		System.out.println("This Constructor is from computer class");
	}

	//This is parameter constructor.
	public Computer(String band, String model, String operatingsystem, int price, char grade, boolean madeInUSA) {
		this.brand = band;
		this.model =model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("\nBrand name " + band + "\nModel " + model + "\nOperating system is "+ operatingsystem + "\nCompuer price " + price + "\nGrade " + grade
				+ " \nMaden in USA " + madeInUSA);

	}
}
