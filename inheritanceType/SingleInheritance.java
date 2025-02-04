package inheritanceType;
class A{
	public A() {
		System.out.println("A class constructor");
	}
	public A(int a) {
		System.out.println(a);
	}
}
class B extends A{
	public B() {
		super(10);
		System.out.println("B class constructor");
	}
	public B(int a) {
		System.out.println(a);
	}
}
class C extends B{
	public C() { 
		super(10);
		System.out.println("C class constructor");
	}
}
class D extends C{
	public D() {
		System.out.println("D class constructor");
	}
}
class E extends A{
	public E() {
		System.out.println("E class constructor");
	}
}
public class SingleInheritance {
	public static void main(String args[]) {
		D box = new D();
	}
}
