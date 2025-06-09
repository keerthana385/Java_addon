package Day3;

public class DefaultConstructor {
	String lang;
	String name;
	int year;
	 DefaultConstructor(String lang, int year, String name) {	
		 this.lang=lang;
		 this.name=name;
		 this.year=year; 
		//System.out.println("Userdefined Constructor"+" "+name+" "+year);
	}
	//for copy constructor
	 DefaultConstructor(DefaultConstructor cp){
		 this.lang=cp.lang;
		 this.name=cp.name;
		 this.year=cp.year;
	 }
	 void Display() {
		 System.out.println("Userdefined Constructor"+" "+name+" "+year);
	 }
	public static void main(String[] args) {
		DefaultConstructor r=new DefaultConstructor("JAVA",1995,"PROGRAMMING");
		r.Display();
		DefaultConstructor r1=new DefaultConstructor(r);
		System.out.println("COPY CONSTRUCTOR");
		r1.Display();
	}

}
