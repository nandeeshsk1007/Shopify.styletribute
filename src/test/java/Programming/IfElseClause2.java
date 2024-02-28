package Programming;

import java.util.Scanner;

import lombok.Builder.ObtainVia;

public class IfElseClause2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int marksObtained, PassingMarks;
	
	PassingMarks=40;
	marksObtained=input.nextInt();
	if (marksObtained>PassingMarks &&marksObtained<=100) {
		System.out.println("You passed the exam");
	}
	else if (marksObtained>100) {
		System.out.println("You entered invalid number - The marks should be less than or equal to 100");
	}
	else
		System.out.println("unfortunately you failed to pass the exam");
}
}
