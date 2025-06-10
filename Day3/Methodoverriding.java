package Day3;
class Laptop{
	void Os() {
		System.out.println("LINUX OS");
	}
}
class Update extends Laptop{
	void Os() {
		System.out.println("MAC OS");
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		Update u=new Update();
		u.Os();
	}

}
