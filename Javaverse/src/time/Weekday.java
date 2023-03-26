package time;

import java.util.Arrays;

public enum Weekday {
	MONDAY(new String[]{"Lunes", "Hetfo"}), TUESDAY("Martes", "Kedd"), WEDNESDAY("Miercoles", "Szerda"), THURSDAY("Jueves", "Csutortok"), FRIDAY("Viernes"), SATURDAY, SUNDAY;
	
	private static String[] langs = {"es", "hu"};
	
	private String[] names;
	//private String lang1Name;
	//private String lang2Name;
	
	private Weekday() {
		//this.lang1Name = "nap";
		//this.lang2Name = "dia";
		
	}
	
	//private Weekday(String[] names) {
	// varargs
	private Weekday(String... names) {
		//this.lang1Name = lang1Name; 
		//this.lang2Name = lang2Name;
		this.names = names;
	}
	
	public Weekday getNextDay(){
		return getDaysAfter(1);
	}

	public Weekday getDaysAfter(int dayCount){
		//int weekdayCount = 7;
		int weekdayCount = Weekday.values().length;
		int nextDayIdx = (this.ordinal() + dayCount) % weekdayCount;  //magical constant
		return Weekday.values()[nextDayIdx];
	}
	
	public String getName(String lang) {
		if (names == null) {
			return "?";
		}
		int langIdx = Arrays.binarySearch(langs, lang);
		if (langIdx >= names.length) {
			return "?";
		}
		return names[langIdx];
	}
}