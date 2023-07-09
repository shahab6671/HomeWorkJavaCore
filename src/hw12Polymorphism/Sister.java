package hw12Polymorphism;

/*
When multiple method is created by the same name, but parameter are different
is called method overloading. 
Method overloading is also called static polymorphism.
Method overloading happen during compile time.
*/

public class Sister {

	// void type method is implemented
	public void sister() {

	}

	// void type parameterized method is implemented
	public void sister(String age4, int age5, int age6) {
		int sisterage = Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age from sister: " + sisterage);
	}

	// Return type parameterized method implemented
	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int sisterage2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("This is all about sister age2 " + sisterage2);
		return sisterage2;
	}

	// Static type method implemented
	public static int sister(int age1, int age2, int age3, String age4,  int age6) {
		int sisterage3 = age1 + age2 + age3 + Integer.parseInt(age4) + age6;
		System.out.println("This is all about sister age3 " + sisterage3);
		return sisterage3;

	}
	// Return type parameterized method which is final implemented
	public final int sister(int age1, int age2, int age3, int age5, int age6) {
		int sisterage4 = age1 + age2 + age3 +age5 + age6;
		System.out.println("This is all about sister age4 " + sisterage4);
		return sisterage4;

	}

}
