package time;

import java.util.Arrays;

public enum Weekday {
	MONDAY(new String[]{"Hetfo", "Lunes"}), TUESDAY("Kedd", "Martes"), WEDNESDAY("Szerda", "Miercoles"), THURSDAY("Csutortok", "Jueves"), FRIDAY("Pentek", "Viernes"), SATURDAY, SUNDAY;
	
	private String[] langs = {"hu", "es"};
	
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
	
//	public String getLang1Name() {
//		return lang1Name;
//	}
//
//
//	public String getLang2Name() {
//		return lang2Name;
//	}

	public Weekday getDaysAfter(int dayCount){
		//int weekdayCount = 7;
		int weekdayCount = Weekday.values().length;
		int nextDayIdx = (this.ordinal() + dayCount) % weekdayCount;  //magical constant
		return Weekday.values()[nextDayIdx];
	}
	
	public String getName(String lang) {
		int langIdx = Arrays.binarySearch(langs, lang);
		return names[langIdx];
	}
}