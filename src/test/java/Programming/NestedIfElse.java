package Programming;

import java.util.Scanner;

public class NestedIfElse {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int passingMarks=40;
	int marksObtained=input.nextInt();
	char grade;
	
	if(marksObtained>=passingMarks) {
		
		if(marksObtained>90) {
			grade='A';
		}
		else if(marksObtained>75) {
			grade='B';
		}
		else if(marksObtained>60) {
			grade='C';
		}
		else {
			grade='D';
		}
		System.out.println("You passed the exam snd grade is "+grade);
	}
	else {
		grade='F';
		System.out.println("You failed and grade is "+grade);
	}
}
}
