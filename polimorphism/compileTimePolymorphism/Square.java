package polimorphism.compileTimePolymorphism;

public class Square extends Cube {
	
	public Square() {
		System.out.println("sub Class Constructer");
	}
	
	public int MethodOverloading(int a) {
		return a*a;
	}
	public int MethodOverloading(int a,int b) {
		return a*a+b*b;
	}
	
	@Override //annotation
	public void MethodOverridding() {
		System.out.println("Square class");
	}
	
	public void ChildChecking() {
		System.out.println("Child Checking");
	}
}
