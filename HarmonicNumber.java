package com.bridgelab.javabasicprogram;
import java.util.Scanner;

public class HarmonicNumber {

	public static double Harmonic(int number){
		double sum =0;
		
		if(number > 0){
			for(double i=1;i<=number;i++){
				sum+=(1/i);
			}
		}
		else{
			System.out.println("INVALID USER INPUT");
		}
		return sum;


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println(Harmonic(n));
		sc.close();
	}

}
