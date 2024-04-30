package entities.exceptions;

public class NoRoomAvailableException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	
	public NoRoomAvailableException(String msg) {
		super(msg);
	}

}
