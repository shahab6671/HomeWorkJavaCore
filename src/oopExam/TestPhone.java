package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println("Calling all method");
		Iphone1 iphone1 = new Iphone1(1400, "apple", 'M', true); // parameterized constructor Initialize 
		iphone1.wireless();
		iphone1.regularClassInfo();
		iphone1.youtube();// This is static method
		iphone1.message();
		iphone1.abstractClassInfo();
		iphone1.camera();
		iphone1.call();
		iphone1.interfaceInfo();
		iphone1.abstractClassInfo();
		iphone1.pager();
		iphone1.wakitoki();
		iphone1.digitalWatch();
		iphone1.watch();
		AppleWatchSeries5.appleWatchSeries5();
		System.out.println("this is getter and setter method");
		iphone1.setPrice(750);
		iphone1.setInfo("Apple");
		iphone1.setUser('M');
		iphone1.setMadeInUsa(true);
		System.out.println("Iphone price is " + iphone1.getPrice() + "\nIphone company name is " + iphone1.getInfo()
				+ "\nIphone type is " + iphone1.getUser() + "\nIphone made in usa " + iphone1.isMadeInUsa());
		System.out.println("\nAppleWatch is instatiate here");
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		appleWatch.watch();
		appleWatch.digitalWatch();
		System.out.println("\nPhone is instatiate here");
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camera();
		Phone.battery();
		phone.wireless();
		phone.pager();
		phone.wakitoki();
		Iphone2 iphone2 = new Iphone2();// default constructor initialized here
		System.out.println("\nIphone2 is instatiate here");
		iphone2.iPhone2Info();
		iphone2.regularClassInfo();
		iphone2.youtube();
		iphone2.abstractClassInfo();
		iphone2.camera();
		iphone2.call();
		iphone2.interfaceInfo();
		iphone2.watch();
		iphone2.digitalWatch();
		iphone2.wakitoki();
		iphone2.pager();
		iphone2.message();
		Iphone2 ip2 = new Iphone2('M');// parameterized constructor Initialize 
		ip2.iPhone2Info('M');
		ip2.setPrice(750);
		ip2.setInfo("Apple");
		ip2.setUser('M');
		ip2.setMadeInUsa(false);
		System.out.println("Price of the Iphone: " + ip2.getPrice() + ", Brand: " + ip2.getInfo() + ", User; "
				+ ip2.getUser() + ", Made in USA: " + ip2.isMadeInUsa());
		Iphone6 iphone6 = new Iphone6();
		System.out.println("\nIphone6 is instatiate here");
		iphone6.materials();
		iphone6.compass();
		iphone6.email();
		iphone6.compass();
		iphone6.email();
		iphone6.photo();
		iphone6.iPhone2Info();
		iphone6.dropbox(); // This is static method
		iphone6.pager();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.watch();
		iphone6.appleWatchInfo();
		iphone6.digitalWatch();
		iphone6.abstractClassInfo();
		iphone6.appleWatchInfo();
		iphone6.watch();
		iphone6.digitalWatch();
		iphone6.wireless();
		iphone6.wakitoki();
		iphone6.youtube();// this is static method

		System.out.println("This is getter and setter method");
		iphone6.setPrice(750);
		iphone6.setInfo("Apple");
		iphone6.setUser('M');
		iphone6.setMadeInUsa(true);
		System.out.println("Iphone price is " + iphone6.getPrice() + "\nIphone company name is " + iphone6.getInfo()
				+ "\nIphone type is " + iphone6.getUser() + "\nIphone made in usa " + iphone6.isMadeInUsa());
		System.out.println("Overloading method are called here");
		iphone6.materials(45, 89);
		iphone6.materials(45, 50, "30");
		iphone6.materials(52, 80, "65", 9);
		iphone6.materials(32, 47, "80", 80);
		iphone6.materials(55, 62, 30);

		// Iphone6 inherit Iphone5 is Single Inheritance.
		// Iphone6 inherit Iphone5, then Iphone5 inherit Iphone4 is called Multi-level
		// inheritance.
		// Iphone2 inherit Iphone1, and Iphone3 also inherit Iphone1 is called
		// hierarchical Inheritance.

	}

}
