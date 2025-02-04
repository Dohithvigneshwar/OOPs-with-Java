package staticCode;

public class StaticMethod {
	public static int a = 10;
	public static void main(String args[]) {
		StaticMethod obj = new StaticMethod();
		obj.objectReference();
		
	}
	static void function() {
		//System.out.println("function()");
		System.out.println(a);
	}
	void objectReference() {
		//fun();
		function();
	}
	void fun() {
		System.out.println("fun()");
	}
}
