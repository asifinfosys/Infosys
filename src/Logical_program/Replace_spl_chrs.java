package Logical_program;

import java.util.Scanner;

public class Replace_spl_chrs {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string which contains spl chars");
		 String name=scan.next();
		 String correctname=name.replace("@","f");
		 System.out.println(correctname);
	}

}
