package exceptionHandling;

//public class Main{
////	int rollno;
////	public Main(int rollno) {
////		this.rollno = rollno;
////	}
//////	@Override
//////	public String toString() {
//////		return rollno+" "
//////				+"class Name is "
//////		;
//////	}
////	public static void main(String args[]) {
//////		Main dohith = new Main();
//////		System.out.println(dohith);
////	}
//	
//	public static void main(String args[]) throws ArithmeticException {
////		try {
////			int a=30;
////			int b=0;
////			int c = a/b;
////		}
////		catch(ArithmeticException e) {
////			System.out.println(e.getMessage());
////		}
////		finally {
////			System.out.println("Always run");
////		}
////		int a=10;
////		int b=0;
////		int c = (a/b);
//		//int a = -1;
////		try {
//////			int c = 10/0;
////			if(a<0) {
////				throw new ArithmeticException("value can't be negative");
////			}
////		}
////		catch(Exception e){
////			System.out.println("Arr exception");
//////			System.out.println("Catch Block");
////			System.out.println(e.getMessage());
//		}
//		
////		int a = 2/0;
//	}
////	{
////	int a = 10;
////	int b = 30;
////	int v = a*b;
////		System.out.println(v);
////}
//	
//	public static void checkThrows() throws Exception{
//		int a = 10/0;
//		System.out.println(a);
//		try {
//			
//		}
//		catch(ArithmeticException e){
//			System.out.println(e.getMessage());
//		}
//	}
//	
//}
public class Main{
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException {
		int a[] = new int[1];
		a[1] = 10;
		try {
		//	int a1 = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}

