package abstractClasses;

public class Son extends Parent{
	public Son(int num) {
		super(num);
	}
	@Override
	public void feature() {
		System.out.println("Feature method in son class");
	}
	@Override
	public void goal() {
		System.out.println("Goal method in Son class");
	}
}
