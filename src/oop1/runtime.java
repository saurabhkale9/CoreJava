package oop1;

class display{
	void sound() {
		System.out.println("sound");
	}
}

public class runtime extends display {

	public static void main(String[] args) {
		runtime r=new runtime();
		r.sound();

	}

}
