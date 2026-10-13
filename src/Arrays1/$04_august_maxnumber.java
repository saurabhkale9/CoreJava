package Arrays1;

public class $04_august_maxnumber {

	public static void main(String[] args) {

		
		int arr[]= {11,233,4,643,3,2};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			
			if(arr[i]>max ) {
				
				max=arr[i];
			
		}
		}
		System.out.println("maximum value is "+max);
		
		
	}
		
	

}
