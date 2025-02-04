package inheritance;

class A{
	public A() {
		System.out.println("A");
	}
	public void show1() {
		System.out.println("A show");
	}
}
class B extends A{
	public B() {
		
		System.out.println("B");
	}
	public void show2() {
		System.out.println("B show");
	}
}
public class Upcasting {
	public static void main(String args[]) {
		A obj = new B();
		obj.show1();
		
	}
}
