package staticCode;

public class StaticInt {
	public static int a = 10;
	public static int b;
	public static String s;
	public static void main(String args[]) {
		StaticInt obj1 = new StaticInt();
		StaticInt obj2 = new StaticInt();
		System.out.println(b);
		obj2.b = obj2.b+10;
		System.out.println(obj1.b);
	}
	static {
		b = 20;
	}
	

}
