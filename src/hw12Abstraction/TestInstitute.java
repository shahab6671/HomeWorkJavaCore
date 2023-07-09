package hw12Abstraction;


public class TestInstitute {
	public static void main(String[] args) {

		System.out.println("\nRegular class ColumbiaUniversity");

		ColumbiaUniversity clu = new ColumbiaUniversity();
		clu.biology();
		clu.commonRoom();
		clu.computerLab();
		clu.laboratory();
		clu.languageClub();
		clu.emergencyRoom();
		clu.surgeryRoom();
		clu.cafeteria();
		clu.lawInfo();
		clu.VocationalInfo();
		clu.classSize();
		clu.playGround();
		clu.teacher();
		clu.anatomyLab();
		clu.hygiene();
		System.out.println("\n..............Interface Universit...........");
		
		University uni = new ColumbiaUniversity();
		uni.playGround();
		uni.teacher();
		uni.gymnasium();
		uni.laboratory();
		uni.languageClub();
		uni.dorm();
		uni.commonRoom();
		uni.emergencyRoom();
		uni.surgeryRoom();
		uni.cafeteria();
		uni.morgue();
		
		System.out.println("\n----------Abstract class MedicalSchool----------");
		
		MedicalSchool medi = new ColumbiaUniversity();
		medi.anatomyLab();
		medi.biochemistryLab();
		medi.aeronauticalInfo();
		medi.caring();
		medi.hygiene();
		medi.maths();
		medi.lawInfo();
		medi.computerLab();
	
		
		
}
}