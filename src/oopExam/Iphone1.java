package oopExam;

/*
 * Regular class is a blueprint from which individual objects are created. 
 * It can be instantiated.  In regular class, method only implemented, not declared. It contains
 * only non abstract method. Two keywords are used for the inheritance in
 * regular class which are "extends" and "implements".
 * A regular class can inherit only one abstract class or one regular class by extends keyword. 
 * A regular class can inherit more than one interface by implements keyword but it cannot inherit any regular class or abstract 
 * class by implements keyword. 
 * Yes, we can make a relation of Iphone1 with Phone Interface by "implements" keyword. 
 * And Iphone1 with AppleWatch Abstract Class by "extends" Keyword.
 */

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String info;
	private char user;
	private boolean madeInUsa;
	public int price2;

	public Iphone1() {
		System.out.println("This is defualt constructor");

	}

	public Iphone1(int price, String info, char user, boolean madeInUsa) {
		super();
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUsa = madeInUsa;
		System.out.println("\nMy iphone price is" + price + "\nMy name is " + info + "\nUser person " + user
				+ "\nMade in USA " + madeInUsa);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUsa() {
		return madeInUsa;
	}

	public void setMadeInUsa(boolean madeInUsa) {
		this.madeInUsa = madeInUsa;
	}

	public void regularClassInfo() {
		System.out.println("all the features of regular class ");
	}

	public static void youtube() {
		System.out.println("This is releted method");
	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void abstractClassInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pager() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Void wakitoki() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void digitalWatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub
		
	}

}
