package Day3;

public class Singlelevel {
	void hi() {
	System.out.println("Single-level inheritance");
	}
}
class subclass extends Singlelevel{
	void hello() {
		System.out.println("Programs");
	}

}
class Main{
	public static void main(String[] args) {
		subclass o=new subclass();
		o.hi();
		o.hello();
	}
}
