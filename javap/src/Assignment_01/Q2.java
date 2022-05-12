package Assignment_01;

class A{
	
	static int count = 0;
	void display() {
		count++;
	}
}
public class Q2 {

	public static void main(String[] args) {
	     A a = new A();
	     
	     A a2 = new A();
         a2.display();
         A a3 = new A();
         a3.display();
         A a4 = new A();
         a4.display();
        System.out.println("no of calls for display function is:"  +a.count);
	}

}
