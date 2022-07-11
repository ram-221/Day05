package com.bridgelab.javabasicprogram;
import java.util.Scanner;

public class LeapYear {
	
	public static boolean isLeapYear(int year){

		if(year % 4==0){
			if(year % 400==0){
				return true;
			}else if(year % 100==0){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter leap year");
		int year = sc.nextInt();
		if(year > 999 && year < 10000)
			System.out.println(isLeapYear(year));
		else
			System.out.println("UNVALID YEAR");
		sc.close();
	}

}
