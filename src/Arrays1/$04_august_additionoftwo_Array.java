package Arrays1;

public class $04_august_additionoftwo_Array {

	public static void main(String[] args) {
		
		int arr1[]= {10,20,30,40,50};
		
		int arr2[]= {10,20,30,40,50};
		
		int arr3[]= new int[5];
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i]+arr2[i];
			
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
				
	}

}
