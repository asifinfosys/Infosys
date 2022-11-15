package Logical_program;

import java.util.Scanner;

public class Replace_multiple_special_symbols {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("hey user print the string with special symbols");
		String name=scan.next();
		
		String correctname=name.replaceAll("[^a-zA-Z]","");
		System.out.println(correctname);
	}

}
