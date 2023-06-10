package hw11Abstraction;

 /*
   We can inherit from one or more interfaces. 
   A regular class or abstract class cannot extends or implements in interface.
 */
//public University() {}, so interface can not contain default constructor.

public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
	}

	public static void library() {

	}
	/*
	 * Extends keyword is used for the inheritance in Interface. 
	 * Interface can inherit other Interface by extends keyword. 
	 * Interface can't inherit regular class by extends keyword. 
	 * Interface can't inherit abstract class by extends keyword. 
	 * Interface can inherit multiple Interfaces by extends key word.
	 */

}
