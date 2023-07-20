package oopExam;

/*
 * Abstract class is a super class, also abstract class can't be instantiated or can't create an object.
 * It's contrain abstract and non-abstract method.
 * Abstract method can be declared but not implement.
 * Non -abstract method can be implement, not a declared. 
 * Abstract class is inherite only one which is regular class or abstract class.
 */
/*
  * Watch and DigitalWatch is an interface class that's why we can not make reletionship with extends keyword.
  * We can use implement keyword to an abstract class.
 */
public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public int age = 43;

	public AppleWatch() {
		System.out.println("yes, we can create constructor");
	}

	/*
	 * Can you instantiate it? Ans: yes
	 */
	public void abstractClassInfo() {
		System.out.println("Abstract Class contains both abstract and non abstract methods");
	}

	public abstract void appleWatchInfo();

}
