package hw7UseOfNestedIf;

import java.util.Scanner;
//	nested if condition below-(13-19)

public class DiabeticCondition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter my Hemoglobin A1C value below");
		double hbA1c = scanner.nextDouble();
		if (hbA1c > 6.4) {
			System.out.println("I am a diabetic patient");
		} else if (hbA1c <= 6.4) {
			if (hbA1c >= 5.7) {
				System.out.println("I am a pre-diabetic patient");
			} else if (hbA1c < 5.7) {
				System.out.println("I am a healthy person");
			}
		}
		scanner.close();
	}
}
