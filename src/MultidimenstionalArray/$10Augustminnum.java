package MultidimenstionalArray;

public class $10Augustminnum {

	public static void main(String[] args) {

int num[][]= {{12,23,45,67,64,4,323,2,23,2},{23,23,23,23,2335},{12,5,89,222}};
int min=num[0][0];
for(int i=0;i<num.length;i++) {
	for(int j=0;j<num[i].length;j++) {
		if(min>num[i][j]) {
			min=num[i][j];
			
		}
		
	}
}
System.out.println(min);
	}

}
