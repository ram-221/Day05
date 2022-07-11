package com.bridgelab.javabasicprogram;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows");
		int m = sc.nextInt();
		System.out.println("Enter the columns");
		int n = sc.nextInt();
		System.out.println("Cases for 2D Array ....");
		System.out.println("1  ==>> Integer");
		System.out.println("2  ==>> Double");
		System.out.println("3  ==>> Boolean");
		int cas = sc.nextInt();
		switch(cas){
		case 1:
			int arr[][] = new int[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					System.out.print(" "+arr[i][j]);
				}
				System.out.println(" ");
			}
		case 2:
			double arrD[][] = new double[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					arrD[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					System.out.print(" "+arrD[i][j]);
				}
				System.out.println(" ");
			}
			
		case 3:
			boolean arrB[][] = new boolean[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					arrB[i][j] = sc.nextBoolean();
				}
			}
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					System.out.print(" "+arrB[i][j]);
				}
				System.out.println(" ");
			}
		default :
			System.out.println("INVALID");
		}
	}

}
