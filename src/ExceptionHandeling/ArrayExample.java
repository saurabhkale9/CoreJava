package ExceptionHandeling;

public class ArrayExample {

	public static void main(String[] args) {

		try {
		int arr[]= new int [-10];
		arr[1]=22;
		arr[2]=23;
		arr[20]=234;
		}
		catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException a){
			System.out.println(a.getMessage());
//			e.printStackTrace();
			
		}
//		catch(ArrayIndexOutOfBoundsException a) {
//			System.out.println(a.getMessage());
//			
//		}
		System.out.println("hii");
		System.out.println("bye");

	}

}
