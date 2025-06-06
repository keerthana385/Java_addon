package Day1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*for(int a=1;a<=100;a++) {
			if(a%2==0) {
		System.out.println(a);
			}*/
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter starting no:");
		int a=s.nextInt();
		System.out.println("Enter ending no:");
		int b=s.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
			System.out.println(i);
		}
	}

}}
