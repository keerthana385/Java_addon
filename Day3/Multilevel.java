package Day3;

class superclass{
void method1() {
		System.out.println("Method1 runs");
	}
}
class subclass1 extends superclass{
void method2() {
	System.out.println("Method2 runs");
	}
}
class subclass2 extends subclass1{
	void method3() {
		System.out.println("Method3 runs");
	}
	}
public class Multilevel {
		public static void main(String[] args) {
			subclass1 s=new subclass1();
			s.method1();
			s.method2();
			
		}
}
