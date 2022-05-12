package Assignment_01;

import java.util.Scanner;

class Student{
	String name;
	int age;
	char sec='A';
	float per;
	static int avg=0;
	
	Student(){
		
	}
	Student(String n, int a, float p, char s){
     name = n;
     age= a;
     sec= s;
     per = p;
     avg +=per;
     System.out.println("NAME:"+ name);
     System.out.println("Age:"+age);
     System.out.println("percentage: "+per+"%");
}
	void average() {
		float avgg = avg/6;
		System.out.println("avg per"+avgg);
	}
}
public class Q1 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Prateek", 19, 98, 'A');
		Student s2 = new Student("Avinash", 19, 45, 'A');
		Student s3 = new Student("Aryan", 19, 78, 'A');
		Student s4 = new Student("Shiva", 19, 44, 'A');
		Student s5 = new Student("Bheem", 19, 90, 'A');
		Student s6 = new Student("Krish", 19, 98, 'A');
		Student s = new Student();
		s.average();
		
		
}

}
