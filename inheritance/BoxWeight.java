package inheritance;
class BoxWeight extends Box{
	public double w;
	public double common = 11.3;
	public BoxWeight() {
		System.out.println("sub class parameterless constructor");
	}
	BoxWeight(double l, double h, double w) {
		super(l,h);
		this.w = w;
//		System.out.println(super.common);
	}
	public void access() {
		System.out.println(super.common+this.common);
	}
	public BoxWeight(double x) {
		
	}
}
