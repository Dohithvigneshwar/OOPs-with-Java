package genericClasses;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
	public static void main(String args[]) {
		ArrayList<? extends Number> list = new ArrayList<>();
		System.out.println(list);
	}
}
