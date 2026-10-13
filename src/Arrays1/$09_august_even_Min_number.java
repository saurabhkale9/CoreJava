package Arrays1;

public class $09_august_even_Min_number {

	public static void main(String[] args) {

		int arr1[]= {12,4,34,56,766,4,322,3,46,43};
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				if(arr1[i]<min) {
					min=arr1[i];
				}
			}
		}
		System.out.println("minimun value is - "+min);
	}

}
