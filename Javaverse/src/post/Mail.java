package post;

import java.util.HashMap;
import java.util.Map;

import city.City;

public class Mail {
	private String targetPostOffice;
	
	
	public Mail(String targetPostOffice) {
		this.targetPostOffice = targetPostOffice;
	}	
	
	public Mail(City city, Map<Integer, String> zipCodeToOffice) {
		this.targetPostOffice = zipCodeToOffice.get(city.getZipCode());
	}
	
	public String getTargetPostOffice() {
		return targetPostOffice;
	}
	
	public void setTargetPostOffice(String targetPostOffice) {
		this.targetPostOffice = targetPostOffice;
	}
	
}
