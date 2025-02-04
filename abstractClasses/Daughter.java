package abstractClasses;

public class Daughter extends Parent {
	public Daughter() {
		super(10);
	}
	public Daughter(int num) {
		super(num);
	}
	@Override
	public void feature() {
		System.out.println("Feature method in daughter class");
		System.out.println(super.num);
	}
	@Override
	public void goal() {
		System.out.println("Goal method in daughter class");
	}
}
