package homeWork04Variables;

public class AboutMeText {
	public static void main(String[] args) {
		AboutMe roney = new AboutMe();
		
		// Veriable initialize
		roney.myName = "shahab uddin ";
		roney.age = 100;
		roney.myHouseRent = 2550;
		roney.carRentyearly = 78945612;
		roney.myWeeklyIncome = 789456123l;
		roney.myHeight = 5.8f;
		roney.myGpa = 56545;
		roney.sex = 'M';
		roney.sunRise = true;
		
		//Method initialized
		roney.aboutMe();
		System.out.println("Method initialized");

		AboutMe alex = new AboutMe();

		alex.myName = "Alex";
		alex.age = 22;
		alex.myHouseRent = 500;
		alex.carRentyearly = 561234;
		alex.myWeeklyIncome = 78945612345645l;
		alex.myHeight = 5.7f;
		alex.myGpa = 4.78965;
		alex.sex = 'M';
		alex.sunRise = true;
		//Method initialized
		alex.aboutMe();
	}

}
