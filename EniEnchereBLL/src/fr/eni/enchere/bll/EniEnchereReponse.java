package fr.eni.enchere.bll;

public class EniEnchereReponse {
	
	private int codeResponse;
	private String messageResponse;
	
	
	public EniEnchereReponse(int codeResponse, String messageResponse) {
		super();
		this.codeResponse = codeResponse;
		this.messageResponse = messageResponse;
	}
	public void setReponse(int code, String message) {
		setCodeResponse(code);
		setMessageResponse(message);
	}
	
	
	public int getCodeResponse() {
		return codeResponse;
	}
	public void setCodeResponse(int codeResponse) {
		this.codeResponse = codeResponse;
	}
	public String getMessageResponse() {
		return messageResponse;
	}
	public void setMessageResponse(String messageResponse) {
		this.messageResponse = messageResponse;
	}

}
