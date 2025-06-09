package Day3;

public class Laptop {
	String model;
	int size;
	public Laptop(String model, int size) {
		this.model=model;
		this.size=size;	
	}
	void Display() {
		System.out.println("LAPTOP MODEL"+" "+model+" "+"and it's RAM size is"+" "+size);
	}

	public static void main(String[] args) {
		Laptop l=new Laptop("HP", 16);
		l.Display();
	}

}
