package Day3;

import java.util.Scanner;

class Student {
    private String name;
    private int rollno;
    private int maths, science, english;  
    public Student(String name, int rollno, int maths, int science, int english) {
        this.name=name;
        this.rollno=rollno;
        this.maths=maths;
        this.science = science;
        this.english = english;
    }  
    public String getName() {
    	return name;
    	}
    public int getRollno() {
    	return rollno;
    	}
    public int getMaths() {
    	return maths;
    	}
    public int getScience() {
    	return science;
    }
    public int getEnglish() {
    	return english;
    	} 
    public void display() {
        int total = maths + science + english;
        double avg = total / 3.0;
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}
public class Mainprog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt();
        System.out.print("Enter Math Marks: ");
        int maths = sc.nextInt();
        System.out.print("Enter Science Marks: ");
        int science = sc.nextInt();
        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();
        Student s = new Student(name, rollno, maths, science, english);
        s.display();
    }
}