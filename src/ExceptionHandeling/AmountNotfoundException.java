package ExceptionHandeling;

public class AmountNotfoundException extends RuntimeException{
	public AmountNotfoundException(String msg) {
		super(msg);
	}
}
