package Arrays1;

public class $09august_maxeven_value {

	public static void main(String[] args) {
		
		int arr1[]= {12,3,323,2,656,34,231,1,212,344,55,221,987};
		
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%1==0) {
				if(arr1[i]>max) {
					max=arr1[i];
				}
				
			}
		}
		System.out.println(max);

	}

}
