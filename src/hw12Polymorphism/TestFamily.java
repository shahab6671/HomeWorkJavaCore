package hw12Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("sister class .................about all");
		
		// Method overloaded are called here from sister class
		Sister sister=new Sister();
		sister.sister();
		sister.sister("10", 20, 40);
		sister.sister(20, 30, 40, "90",60,70);
		sister.sister(80, 90, 10, 20, 30);
		sister.sister(15, 25, 26, "10", 16);
		
		System.out.println("All about niece ..........class");	
		
		// Method overridden are called here from Niece class
		Niece niece = new Niece();
		niece.sister();
		niece.sister("5", 10, 20);
		niece.sister(70, 80, 90, "5", 50, 70);
	}


}
