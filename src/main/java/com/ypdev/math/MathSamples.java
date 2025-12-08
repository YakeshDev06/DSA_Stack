package com.ypdev.math;

import java.util.TreeSet;

public class MathSamples {

	public int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			count = count + 1;
			n = n / 10;
		}
		System.out.println("Total count of given digits: " + count);
		System.out.println("-------------------------------------");
		return count;
	}

	public int reverseCut(int n) { // Reverse given no by cutting trailing zero's in end
		int revNo = 0;
		int ld = 0;
		while (n > 0) {
			ld = n % 10;
			revNo = (revNo * 10) + ld;
			n = n / 10;
		}
		System.out.println("Reversed by cutting trailing zeros: " + revNo);
		System.out.println("-------------------------------------");
		return revNo;
	}

	public boolean isPalindrome(int n) {
		int pVal = 0;
		int actualVal = n;
		int ld = 0;
		while (n > 0) {
			ld = n % 10;
			pVal = (pVal * 10) + ld;
			n /= 10;
		}
		if (pVal == actualVal) {
			System.out.println("is Palidrome !");
			System.out.println("-------------------------------------");
			return true;
		} else {
			System.out.println("not a Palidrome !");
			System.out.println("-------------------------------------");
			return false;
		}
	}

	public boolean armstrongCalculation(int n) {
		int actual = n;
		int ld = 0;
		int result = 0;
		while (n > 0) {
			ld = n % 10;
			result += (ld * ld * ld);
			n /= 10;
		}
		return (actual == result) ? (true) : (false);
	}

	static void printDivisors(int n) {
		TreeSet hs = new TreeSet<>();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				hs.add(i);
				if ((n / i) != i) { // Squareroot limit check.
					hs.add(n / i);
				}
			}
		}
		System.out.println("Divisors: " + hs);
		System.out.println("-------------------------------------");
	}

	static void isPrime(int n) {
		int count = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				count++;
				if (n / i != i) {
					count++;
				}
			}
		}
		if (count == 2) {
			System.out.println("is prime !");
		} else {
			System.out.println("not a prime !");
		}
		System.out.println("-------------------------------------");
	}

	static void findGcd(int nOne, int nTwo) {
		for (int i = Math.min(nOne, nTwo); i >= 0; i--) {
			if (nOne % i == 0 && nTwo % i == 0) {
				System.out.println("GCD of given no is : " + i);
				break;
			}
		}
		System.out.println("-------------------------------------");
	}

	static void gcdBasedOnEuclideanPrinciple(int a, int b) {
		while (a > 0 && b > 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a == 0) {
			System.out.println("GCD of given no's: " + b);
		} else {
			System.out.println("GCD of given no's: " + a);
		}
		System.out.println("-------------------------------------");
	}

	public static void main(String[] args) {
		MathSamples ms = new MathSamples();
		ms.countDigits(444);
		ms.reverseCut(786100);
		ms.isPalindrome(1331);
		System.out.println("is given no armstrong : "+ms.armstrongCalculation(3712));
		System.out.println("-------------------------------------");
		printDivisors(36);
		isPrime(7);
		findGcd(7, 20);
		gcdBasedOnEuclideanPrinciple(30, 100);
	}

}
