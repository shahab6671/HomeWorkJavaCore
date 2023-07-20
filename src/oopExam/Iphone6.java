package oopExam;

public class Iphone6 extends Iphone5 {
	public void compass() {
		System.out.println("This is compass method");
	}

	// Inheritance concept is used to relate to Iphone1 to Iphone6.
	/*
	 * What kind of concept you can use to relate to Iphone1 to 6? Instantiate
	 * Iphone6 in TestPhone and show how many methods they can call in TestPhone.
	 * [points: 70] .
	 */
	public void materials() {
		System.out.println("This is void type method");

	}

	public int materials(int ramPrice, int camraPrice) {
		int total1 = ramPrice + camraPrice;
		System.out.println("This is total1 " + total1);
		return total1;
	}

	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int total2 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("This is total2 " + total2);
		return total2;
	}

	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice, float laptop) {
		int total3 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + (int) laptop;
		System.out.println("This is total3 " + total3);
		return total3;

	}

	public static int materials(int ramPrice, int cameraPrice, int laptop) {
		int total4 = ramPrice + cameraPrice + laptop;
		System.out.println("This is total4 " + total4);
		return total4;
	}

	public final int materials(int ramPrice, int cameraPrice, String ProcessorPrice, int laptop) {
		int total5 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + laptop;
		System.out.println("This is total5 " + total5);
		return total5;

	}
}
