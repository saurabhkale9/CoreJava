package MultidimenstionalArray;

public class $10_multidimentionalArray {

	public static void main(String[] args) {
		int numbers[][]=new int[4][3];
		
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		
		numbers[1][0]=40;
		numbers[1][1]=50;
		numbers[1][2]=60;
		
		numbers[2][0]=60;
		numbers[2][1]=70;
		numbers[2][2]=80;
		
		numbers[3][0]=90;
		numbers[3][1]=100;
		numbers[3][2]=110;
		
//		System.out.println(numbers[0][0]);
//		System.out.println(numbers[0][1]);
//		System.out.println(numbers[0][2]);
//		
//		System.out.println(numbers[1][0]);
//		System.out.println(numbers[1][1]);
//		System.out.println(numbers[1][2]);
//		
//		System.out.println(numbers[2][0]);
//		System.out.println(numbers[2][1]);
//		System.out.println(numbers[2][2]);
//		
//		System.out.println(numbers[3][0]);
//		System.out.println(numbers[3][1]);
//		System.out.println(numbers[3][2]);
//		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
	}

}
