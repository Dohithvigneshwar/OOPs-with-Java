package staticCode;

public class Static {
	public static int count;
	public String name = null;
	public Static(String name) {
		this.name = name;
		Static.count += 1; 
		//System.out.println(Static.count);
		//this.message();//not correct way to access static method
		Static.message();
	}
	private static void message() {
		//System.out.println(this.name); non static data cannot be accessed static method
		//if you access non static data into static method you must be declare the variable as static 
		System.out.println("hello");
		
	}
	
}
