package com.bridgelab.javabasicprogram;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner object = new Scanner(System.in);
		System.out.println("Enter the number of times FLIP the COIN:");
		int n = object.nextInt();
		int head =0,tail=0;
		for(int i=0;i<n;i++){
			if(Math.random()<0.5){
				head++;
			}
			else{
				tail++;
			}
		}
		int hper = (head*100)/n;
		int tper = (tail*100)/n;
		System.out.println("Head Percentage:-->"+hper+"%");
		System.out.println("Tail Percentage:-->"+tper+"%");
		System.out.println("HEADS:--> "+head);
		System.out.println("TAILS:--> "+tail);



	}

}
