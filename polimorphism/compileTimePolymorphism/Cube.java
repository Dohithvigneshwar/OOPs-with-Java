package polimorphism.compileTimePolymorphism;

public class Cube {
	int num  = 10;
//	public Cube() {
//		System.out.println("cube");
//	}
	
//	final public void MethodOverridding() {
//		System.out.println("Cube class");
//	}
	public void MethodOverridding() {
		System.out.println("Cube class");
	}
	public int add(int a,int b) {
		return a+b;
	}
//	public float add(int a,int b) {
//		return a+b;
//	}
	
	public void ParentChecking() {
		System.out.println("Parent Checking");
	}
	
}
