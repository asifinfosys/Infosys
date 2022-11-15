package Logical_program;

public class Find_whitespeces {
	public static void main(String[] args) {
		String name= "A S I F";
		int count=0;
		for(int i=0;i<name.length()-1;i++) {
			char v=name.charAt(i);
			if(v==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
