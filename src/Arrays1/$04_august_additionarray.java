package Arrays1;

public class $04_august_additionarray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,31,40,51};
		int total=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
			
			total=total+arr[i];
			}
			
		}
		System.out.println(total);
		
		
		

	}

}
