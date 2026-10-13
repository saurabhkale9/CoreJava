package MultidimenstionalArray;

public class maxnum {

	public static void main(String[] args) {
		int num[][]= {{2,23,34,35,21,23,34,2,3,33,},{230,2317,232,23,34,566,52,12,1,32}};

		int max=num[0][0];
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				
				if(max<num[i][j]) {
					max=num[i][j];
				}
			}
		}
		System.out.println("max number is "+max);
	}
	

}
