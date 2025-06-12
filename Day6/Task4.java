package Day6;

public class Task4 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello"+" "+i);
		}
	}
}
class Execute{
	public static void main(String[] args) {
	Task4 t=new Task4();
	t.start();

	}

}
