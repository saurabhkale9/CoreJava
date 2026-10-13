package collection;

public class Student extends Object {
	//every class will extendss Object
	
		
		private int id;
		private String name;
		private String address;

		
//	convert the object adress into string
//		@Override
//		public String toString() {
//			return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
//		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}
		
		
		

//		to convert address into string
//		tostring--> object class
}
