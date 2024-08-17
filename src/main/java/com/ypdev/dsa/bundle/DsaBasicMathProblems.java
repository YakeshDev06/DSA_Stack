package com.ypdev.dsa.bundle;

public class DsaBasicMathProblems {

	public void findOddEven(long no) {

		if (no % 2 == 0) {
			System.out.println("Given no " + no + " is even");
		} else {
			System.out.println("Given no " + no + " is odd");
		}

	} 
	
	//Check for pull request.

	public static void main(String[] args) {
		DsaBasicMathProblems dsa = new DsaBasicMathProblems();
		dsa.findOddEven(21);
	}

}
