package polimorphism.compileTimePolymorphism;

class A{
	public void display() {
		System.out.println("Display method class A");
	}
}

public class Quizz extends A{
	public void display() {
		super.display();
		System.out.println("Display method of class Quizz");
	}
	public static void main(String args[]) {
		A a = new Quizz();
		a.display();
	}
}
