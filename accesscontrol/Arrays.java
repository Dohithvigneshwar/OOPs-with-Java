public class Arrays{
     public static void main(String args[]){
          int a[] = new int[]{1,2,3,4,5,6,7,8};
          System.out.println(1%3==0);
          int[][] numbers = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
		int total = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (i == j)
					continue;
                    System.out.println(numbers[i][j]);
				total += numbers[i][j];
			}
		}
		System.out.println("Result = " + total);
	}
}