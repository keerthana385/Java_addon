package Day3;
//Method overloading
public class Shoppingmart {
	void add_to_cart(String category, int price) {
		System.out.println("Your category:"+category);
		System.out.println("Item price:"+price);
	}
	void add_to_cart(String category, int price, int quantity) {
		int total=price * quantity;
		System.out.println(total);
	}
	public static void main(String[] args) {
		Shoppingmart in=new Shoppingmart();
		in.add_to_cart("Tops", 350);
		in.add_to_cart("Tops", 350, 3);

	}

}
