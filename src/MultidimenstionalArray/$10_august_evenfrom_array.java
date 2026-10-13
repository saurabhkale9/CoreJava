package MultidimenstionalArray;

public class $10_august_evenfrom_array {

	public static void main(String[] args) {

		int total=0;
		int nums [][]= {{10,11,12,133,343,2,2,42,3,12},{22,3,434,34,2,234,34,2}};
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(nums[i][j]%2==0) {
					total=total+nums[i][j];
//					System.out.print(nums[i][j]+" ");
					
				}
			}
//			System.out.println();
			
		}
		System.out.println(total);

	}

}
