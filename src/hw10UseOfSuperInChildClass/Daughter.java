package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public int birthMonth;
	public int age;
	
	public Daughter() {
		super();
		super.father();
		super.fatherInfo("Shiraj ullah", 70,'M', false);
		super.familyName="Gazi";
		System.out.println("I am a default constructor from daughter");
	}

	public Daughter(int birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\nMy birthday month " + birthMonth + "\nMy age is " + age);
	}
	public void daughter() {
	}
	public void daughterInfo(int birthMonth, int age) {
		super.father();
		super.fatherInfo("Shiraj ullah", 70,'M', false);
		super.familyName= "Gazi";
	
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\nMy birthday month " + birthMonth + "\nMy age is " + age);
		System.out.println("FamilyName: " + familyName);		
	}
 
}
