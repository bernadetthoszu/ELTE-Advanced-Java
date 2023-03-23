package city;

public enum City {
	NEW_YORK("12345"), LONDON(19732), PARIS, MADRID, BUDAPEST(NEW_YORK);
	
	private int zipCode;
	
	City(){
		this(1234);  //calls third constructor
		//zipCode = 1234;
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
}
