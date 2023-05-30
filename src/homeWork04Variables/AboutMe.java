package homeWork04Variables;

public class AboutMe {
	
	// declare veriable Below:
	public String myName;
	public byte age;
	public short myHouseRent;
	public int carRentyearly;
	public long myWeeklyIncome;
	public float myHeight;
	public double myGpa;
	public char sex;
	public boolean sunRise;

	// this is constructor below
	public AboutMe() {
		System.out.println("This is all about me");

	}

	// Method implimented below.
	// Method to print meaningful information.
	public void aboutMe() {
		System.out.println("My name:" + myName + "MY age:" + age + "My House Rent" + myHouseRent + "Car Rent yearly:"
				+ carRentyearly + "My Weekly Income:" + myWeeklyIncome + "My Height:" + myHeight + "My Gpa:" + myGpa
				+ "sex" + sex + "Sun Rise" + sunRise);

	}
}
