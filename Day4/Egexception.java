package Day4;

public class Egexception {

	public static void main(String[] args) {
		try {
			int[] myNum= {1, 2, 3};
			System.out.println(myNum[10]);
		}
		catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		finally {
			System.out.println("The 'try catch' is finished");
		}
	}

}
