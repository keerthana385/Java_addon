package Day4;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		ArrayList<Object> b=new ArrayList();
		a.add(100);
		a.add(150);
		a.add(200);
		a.add(250);
		a.add(300);
		a.forEach(num->System.out.println(num*num));
		a.forEach(age->{
			if(age>=18) {
				System.out.println("Allowed");
			}
			else {
				System.out.println("Not Allowed");
			}
		});
		b.add("RAKSHANA RESHMA NITHYASHREE");
		System.out.println(a);
		System.out.println(b);
		
	}

}
