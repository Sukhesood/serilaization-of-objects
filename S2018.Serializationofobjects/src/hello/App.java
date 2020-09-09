package hello;

import java.io.Serializable;

public class App implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private int number;
	public App(String type, int number) {
		super();
		this.type = type;
		this.number = number;
	}
	@Override
	public String toString() {
		return "App [type=" + type + ", number=" + number + "]";
	}
	
	

}
