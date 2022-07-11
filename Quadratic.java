/* Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)*/

package com.bridgelab.javabasicprogram;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read=new Scanner(System.in);
		System.out.println("Enter the a,b and c values....:");
		int a=read.nextInt();
		int b=read.nextInt();
		int c=read.nextInt();
		
		double delta=(b * b) - (4 * a * c);
		double root1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (double) (-b + Math.sqrt(delta)) / (2 * a);
		System.out.println("The two root of equation are: "+root1 +" and "+root2);
		
	}

}
