package post;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import city.City;

public class PostMain {
	public static void main(String[] args) {
		Map<Integer, String> zipCodeToOffice = new HashMap<>();
		zipCodeToOffice.put(10001, "USPS");
		zipCodeToOffice.put(5208, "Royal Mail");
		zipCodeToOffice.put(70123, "La Poste");
		zipCodeToOffice.put(28001, "Correos");
		zipCodeToOffice.put(1007, "Magyar Posta");
		
		var po1 = new PostOffice("Magyar Posta", 2, Map.of());
		
		Map<String, PostOffice> forwarding = new HashMap();  //?
		forwarding.put("Magyar Posta", po1);
		var po2 = new PostOffice("Correos", 4, forwarding);
		
		Map<String, PostOffice> forwarding2 = new HashMap();  //?
		forwarding2.put("Magyar Posta", po2);
		var po3 = new PostOffice("USPS", 4, forwarding2);
		
		
		Mail mail = new Mail("Magyar Posta");  //Ctrl+1
		LocalDate date = LocalDate.of(2015, 02, 20);
//		po2.receive(mail);
//		po2.receive(mail);
//		po2.receive(mail);
//		po2.receive(mail);
//		po2.receive(mail);
		
		po3.receive(mail, date);
		po3.receive(mail, date);
		po3.receive(mail, date);
		po3.receive(mail, date);
		po3.receive(mail, date);
		
		Mail mail1 = new Mail(City.NEW_YORK_CITY, zipCodeToOffice);
		System.out.println(mail1.getTargetPostOffice());
	}
}
