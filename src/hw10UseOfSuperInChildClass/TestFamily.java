package hw10UseOfSuperInChildClass;

public class TestFamily {
public static void main(String[] args) {
	System.out.println("Default Constructor initialized from Father class:");
	Father father = new Father();
	System.out.println("\nParameterized constructor initialized from Father class:");
	Father father01 = new Father("Shiraj ullah",70,'M',false);
	System.out.println("\nVoid type method initialized from Father class:");
	father.father();
	System.out.println("\nParameterized type method initialized from Father class:");
	father.fatherInfo("Shiraj ullah", 70,'M', false);
	System.out.println("\nDefault Constructor initialized from Daughter class:");
	Daughter daughter =new Daughter();
	System.out.println("\nParameterized constructor initialized from Daughter class:");
	Daughter daughter2 = new Daughter(12, 36);
	System.out.println("\nvoid type method initialized from Daughter class:");
	daughter.daughter();
	System.out.println("\nparameterized type method initialized from Dughter class:");
	daughter.daughterInfo(12, 36);
}
}
