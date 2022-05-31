package unit03;

import java.util.*;
public class P16_Multithreading {

	public static void main(String[] args) {
//		C1 c = new C1();
//		c.show1();
//		C2 c1 = new C2();
//		c1.show2();
		Thread t1 = new Thread(new T1(),"T1");
		Thread t2 = new Thread(new T2(),"T2");	
		Thread t3 = new Thread(new T3(),"T3");	
        t1.start();
        t2.start();
        t3.start();
	}

}

class C1{

	void show1() {
	  Scanner sc= new Scanner(System.in);
	  int r= sc.nextInt();
	  System.out.println(r);
	  System.out.println("done with show1()");	
	  sc.close();	
	}
}
//start those thread
class C2 {
	void show2() {
		for(int i=0;i<10;i++)
			System.out.println("hello->"+i);
		System.out.println("done with show2()");	
	}
}

// these class are called thread class
class T1 extends Thread{
	public void run() {
		  Scanner sc= new Scanner(System.in);
		  int r= sc.nextInt();
		  System.out.println(r);
		  System.out.println("done with show1()");	
}
}

//these class are called thread class
class T2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("hello"+i);
		System.out.println("done with show2()");	
}
}

class T3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("hello_3"+i);
		System.out.println("done with show3()");	
}
}