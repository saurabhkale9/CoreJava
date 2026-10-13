package looping_Statements;

public class $12_June_ForLoop {

	public static void main(String[] args) {

		
		int num=1;
		for (int i = 1; i <=5; i++) {   //1  2  3  4  5
			for (int j = 1; j <=i; j++) {   //1<=5t  2<=5 3<=5 4<=5 5<=5
				System.out.print(num+" ");  // 1 2  3  4  5  6 7 8 9 10 11 12 13 14 15
				num=num+1;  //2 3 4 5 6 7 8 9 11 12 13 14 15 16
			} 
			System.out.println();
		}
		

	}

}
//
//1
//2 3 
//4 5 6 
//7 8 9 10
//11 12 13 14 15