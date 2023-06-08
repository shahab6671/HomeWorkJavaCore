package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// Default Constructor Initialized
		Computer computer01 = new Computer();
		Computer computer02 = new Computer("Asus", "DESKTOP-NUVBTG5", "Windows 10 ",2016, 800, 'A', false);
		
		System.out.println("\n...............................................................\n");
		Computer computer03 =new Computer("Apple", "MacBook Air", "MacOS Mojave",2023, 800, 'A',false); 
		
	}
}
	