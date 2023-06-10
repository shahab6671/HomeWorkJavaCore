package hw10UseOfSuperInChildClass;

	public class Father {
		public String name;
		public int age;
		public char sex;
		public boolean usCitizen;
		public String familyName;
		
	public Father() {
		System.out.println("I am a default constructor");
	}
	 public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\nMy name is " + name + "\nMy age " + age + "\nSex " + sex + "\nusCitizen " + usCitizen);
	}
	public void father() {
		 System.out.println("This is a void type method from father class");

	 }
	 public void fatherInfo(String name, int age, char sex , boolean usCitizen) {
	 	this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\nMy name is " + name + " \nMy age " + age + "\nSex " + sex + "\nusCitizen " + usCitizen);
	 
	 }
}
