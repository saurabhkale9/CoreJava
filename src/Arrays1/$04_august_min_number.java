package Arrays1;

public class $04_august_min_number {

	public static void main(String[] args) {
	
		
//		int arr1[]= {11,22,33,44,55};
//		
//		int min=arr1[0];
//		for(int i=1;i<arr1.length;i++) {
//			if(arr1[i]<min) {
//		min=arr1[i];
//			}
//		}
//	  	System.out.println(min);
		
		int arr1[]= {12,3,4,6,765,3,222,3,5,};
		int min=arr1[0];
		
		
		for(int i=1;i<arr1.length;i++) {
			if(min>arr1[i]) {
				min=arr1[i];
			}
			
		}
		System.out.println("minimun value of array is.."+min);
	}

}
