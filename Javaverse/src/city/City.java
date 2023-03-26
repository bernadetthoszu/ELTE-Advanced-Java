package city;

public enum City {
	NEW_YORK_CITY("10001"), LONDON(5208), PARIS(70123), MADRID(28001), BUDAPEST(1007), LONG_ISLAND(NEW_YORK_CITY);
//	NEW_YORK(BUDAPEST), LONDON(19732), PARIS, MADRID, BUDAPEST(NEW_YORK);  -- cannot reference a foeld before it is defined
	
	private int zipCode;
	
	City(){
		this(0);  //calls third constructor
		//zipCode = 0;
	}
	
	City(String zipAsText){
		zipCode = Integer.parseInt(zipAsText);
	}
	
	City(int zipCode){
		this.zipCode = zipCode;
	}
	
	City(City other){
		this.zipCode = other.zipCode;
	}
	
	public int getZipCode() {
		return this.zipCode;
	}
	
	@Override
	public String toString() {
		return this.name() +  " " + zipCode;
	}
}
