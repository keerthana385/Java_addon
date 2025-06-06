package Day1;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter weight:");
		int a=n.nextInt();
		System.out.println("Enter age:");
		int b=n.nextInt();
		if(a>=50&&b>=18) {
			System.out.println("You're eligible for blood donation");
		}else {
			System.out.println("You are not eligible for blood donation");
		}
	}
}
