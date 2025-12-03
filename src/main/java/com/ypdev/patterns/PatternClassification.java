package com.ypdev.patterns;

public class PatternClassification {

	static void rightAngleTriangle(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}

	static void rightAngleWithNos(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}

	static void revertRight(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}

	static void revertedRightWithNos(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}

	static void pyramid(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) { // l
				System.out.print("*");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}

	static void revertedPyramid(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * n - (2 * i + 1); j++) { // l
				System.out.print("*");
			}

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}

	static void diamond(int n) {
		for (int i = 0; i < n; i++) { // top
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) { // bottom
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n * 2 - (2 * i + 1); j++) { // 10 limit - upper pyramid condition.
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++) { // l
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		rightAngleTriangle(5);
		rightAngleWithNos(5);
		revertRight(5);
		revertedRightWithNos(5);
		pyramid(5);
		revertedPyramid(5);
		diamond(5);

	}

}