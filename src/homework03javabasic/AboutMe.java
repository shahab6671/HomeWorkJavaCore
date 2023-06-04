package homework03javabasic;


public class AboutMe {
	
	// Variable declare line number is(9)
	// Variable initialized line number is(10)

	public String myName;
	public String my_name="Shahab Uddin";
	public byte age = 22;
	public short myHouseRent=500;
	public int carRentyearly=561234;
	public long myWeeklyIncome=78945612345645l;
	public float myHeight=5.7f;
	public double myGpa =4.78965;
	public char sex='M';
	public boolean sunRise=true;
	
	public static void main(String[] args) {
	
	// Info is below- 1. object - roney 2. AboutMe- class 
	//indentation  line number

	AboutMe roney=new AboutMe(); 
	System.out.println(roney.my_name);
	System.out.println(roney.age);
	System.out.println(roney.sunRise);
	System.out.println(roney.myHeight);
	System.out.println("My is name " +roney.my_name +"; and my age " + roney.age + ";my sex " +roney.sex + "; my 7days income " + roney.myWeeklyIncome);
	System.out.println("\nMy is name " + roney.my_name +" ;\nand my age " + roney.age + " ; my sex " +roney.sex + " ; my 7days income " + roney.myWeeklyIncome);
	
	}
	
	

}
