package hw12Polymorphism;

/*
 When multiple method created by the same name and parameter are same,
 but the logic are different is called method Overridden.
 It also called dynamic polymorphism.
 Method override happen during run time.
 Final method can not be overridden, since the method is final and used for the same class.
 Static method can't be overridden too, but static method can be implemented in child class 
 without @Override annotation.
 */

public class Niece extends Sister {

	@Override
	public void sister() {
		// TODO Auto-generated method stub
		super.sister();
	}

	@Override
	public void sister(String age4, int age5, int age6) {
		// TODO Auto-generated method stub
		super.sister(age4, age5, age6);
	}

	@Override
	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		// TODO Auto-generated method stub
		return super.sister(age1, age2, age3, age4, age5, age6);
	}

	
	
}