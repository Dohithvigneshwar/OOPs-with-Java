package interfaces;

interface Engine {
	void start();

	 default void display() {
		System.out.println("hello");
	}
	 static void normal() {
		 System.out.println("static block");
	 }
}