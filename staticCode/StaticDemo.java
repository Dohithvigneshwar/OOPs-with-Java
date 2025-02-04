package staticCode;

class A{
	public static int a = 10;
	static {
		System.out.println(a);
		//System.out.println("Hello");
	}
	public void display() {
		System.out.println("Hello");
	}
}
public class StaticDemo {
	private static int a = 10;
	public static void main(String args[]) {
		A obj = null;
		StaticDemo.a++;
		System.out.println(a);
		obj.display();
	}
}
