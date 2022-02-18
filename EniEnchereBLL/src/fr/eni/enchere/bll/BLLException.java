package fr.eni.enchere.bll;

public class BLLException extends Exception {

	public BLLException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BLLException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BLLException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "BLL - "+super.getMessage();
	}
	
	
	

}
