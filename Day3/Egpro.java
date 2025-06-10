package Day3;

abstract class Egpro {
	abstract void m1();
}
	class display extends Egpro{
		void m1() {
			System.out.println("Welcomeee");
		}
	}
class Main{
	public static void main(String[] args) {
		display d=new display();
		d.m1();
	}
}
