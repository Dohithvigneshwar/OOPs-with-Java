package abstractClasses;

abstract public class Parent {
	public int num;
	public int n = 10;
	public Parent() {
		
	}
	public Parent(int num) {
		this.num = num;
	}
	public void display() {
		System.out.println("this method for display in abstract parent class");
	}
	abstract void feature();
	abstract void goal();
	public void display() {
		int x = 99;
		int y = 1;
		int c = x+y;
		System.out.print(c);
	}
	public static void StaticMethod() {
		System.out.println("static method");
	}
}
