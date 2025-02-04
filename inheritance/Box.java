package inheritance;
class Box {
	public double common = 10.3;
	public double l, h;
	public Box(double x) {
		System.out.println("checked");
	}
	public Box(){
		this.l = 0.1;
		this.h = 0.1;
		System.out.println("super class parameterless constructor");
	}
	public Box(double l,double h) {
		this.l = l;
		this.h = h;
	}
	public Box(Box copyobj) {
		this.l = copyobj.l;
	}
}
