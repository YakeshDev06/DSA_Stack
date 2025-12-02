package com.ypdev.patterns;

public class PatternClassification {

	static void rightAngleTriangle(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		rightAngleTriangle(5);
	}

}