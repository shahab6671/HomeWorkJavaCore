package oopExam;

/*
 1. Interface is a blueprint of class. 
 2. Also interface class can't be instantiated or can't create an object.
 3. An interface is a collection of methods that are defined (declared) but not implemented. 
 4. Abstract method can not be implemented, can be declared only
 5. Contains default and static method only which are non abstrac.
 6. Interface inherit more then one in interface .
 7. Does not have constructor.
 8.This is not mandatory to put abstract keyword with the abstract method inside Interface
 */

public interface Phone extends Pager, Wakitoki {

	public int age = 33;

	/*
	 * Inerface class can not create a constuctor.
	 */
	public  void interfaceInfo();

	public  void call();

	public  void message();

	public  void camera();

	public static void battery() {
		System.out.println("Battery is a non-abstract method from Java ");
	}

	public default void wireless() {
		System.out.println("Wirelessis a non-abstract method from Java ");
	}
}
