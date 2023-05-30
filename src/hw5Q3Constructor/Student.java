package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;
	 
	public Student() {
		System.out.println("This is default Constructor of the Student class");
	}
	//hints: source -- generate constructor using fields-

	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("\nStudent is Name: " + stName + "\nStudent ID number: " + stID + "\nStudent Sex: " + sex + "\nStudent IsProgrammer: " + isProgrammer
				+ "\nStudent Grade: " + grade);
	}


}
