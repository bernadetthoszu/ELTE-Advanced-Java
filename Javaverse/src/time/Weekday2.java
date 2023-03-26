package time;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

@SuppressWarnings("unchecked")
public enum Weekday2 {
	MONDAY(entry("hu", "Hetfo"), entry("es", "Lunes")),
	TUESDAY(entry("hu", "Kedd"), entry("es", "Martes")),
	WEDNESDAY(entry("hu", "Szerda"), entry("es", "Miercoles")),
	THURSDAY(entry("hu", "Csutortok"), entry("es", "Jueves")),
	FRIDAY(entry("hu", "Pentek"), entry("es", "Viernes")),
	SATURDAY(entry("hu", "Szombat"), entry("es", "Sabado")),
	SUNDAY(entry("hu", "Vasarnap"), entry("es", "Domingo"));
	
	private Map<String, String> langToName;
	
	private Weekday2(String... names) {
		langToName = new HashMap<>();
		for (int i = 0; i < names.length/2; i++) {
			langToName.put(names[2*i], names[2*i+1]);
		}
	}
	
	private Weekday2(Map.Entry<String, String>... names){
	//private Weekday2(AbstractMap.SimpleEntry<String, String>... names) {
		langToName = new HashMap<>();
		for (var name : names) {
			langToName.put(name.getKey(), name.getValue());
		}
	}
	
	public Weekday2 getNextDay(){
		return getDaysAfter(1);
	}
	
	public Weekday2 getDaysAfter(int dayCount){
		//int weekdayCount = 7;
		int weekdayCount = Weekday2.values().length;
		int nextDayIdx = (this.ordinal() + dayCount) % weekdayCount;  //magical constant
		return Weekday2.values()[nextDayIdx];
	}
	
	public String getName(String lang) {
		var name = langToName.get(lang);
		if (name == null) {
			return "?";
		}
		return name;
	}
}
