package hw10Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("\"shahab uddin\"");
		emp.setAge(30);
		emp.setSex('M');
		emp.setCitizen(false);
		System.out.println("My name is " + emp.getName()+ "\nMy age is " + emp.getAge() + "\nMy sex " + emp.getSex()
				+ "\nAm i USA citizen? Ans: " + emp.isCitizen());
	}
}
