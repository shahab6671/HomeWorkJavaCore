package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'M';

	public Iphone2() {
		super();
		super.price2 = 1400; // variable is initialized here by super key word
		super.regularClassInfo();
		System.out.println("iphone price " + price2);
	}

	public Iphone2(char userOfIphone2) {
		super(1200, "iphone", 'M', true);
		super.price2 = 1300;
		System.out.println("this is all super keyword");

	}

	public void iPhone2Info() {
		super.price2 = 1200;
		super.regularClassInfo();
		super.youtube();
	}

	public void iPhone2Info(char sex) {
		super.price2 = 1300;
		super.regularClassInfo();
		super.abstractClassInfo();
		super.camera();
		super.interfaceInfo();
		super.call();
		System.out.println("This is iphone2Info method");
	}

	public static void dropbox() {
		System.out.println("We can share file in dropBox.");

	}

}
