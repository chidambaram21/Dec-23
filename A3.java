package chintu;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
       
		
		int[]num;
		Scanner Sc=new Scanner(System.in);
		//10 20 30 40 60 50 
		
		/*
		 * Write a program to filter duplicate numbers
		 * 
		 * 
		 */
		System.out.println("enter total no size");
		int size=Sc.nextInt();
		num = new int [size];
		
		
		System.out.println("enter all " + size+" number");
		
		for(int p=0;p<size;p++) {
			num[p]=Sc.nextInt();
		}
		//10 20 30 10 20
		///

		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]+" ");
			}
		}
	}

	}
}
