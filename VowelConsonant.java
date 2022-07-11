// Java Program to Check Whether an Alphabet is Vowel or Consonant

package com.bridgelab.javabasicprogram;
import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		System.out.println("Enter an Aplhabet");
		char alphabet=read.next().charAt(0);
		if(alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='0' || alphabet=='u') {
			System.out.println(alphabet+ " is Vowel");
		}
		else {
			System.out.println(alphabet+ " is Consonant");
		}

	}

}
