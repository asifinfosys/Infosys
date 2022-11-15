package Logical_program;

import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("user enter num");
		int num= scan.nextInt();
		//to check whether num is even or odd
		if(num%2==0) {
			System.out.println("given num is even");
			
		}
		else {
			System.out.println("given num is odd");
		}
	}

}
