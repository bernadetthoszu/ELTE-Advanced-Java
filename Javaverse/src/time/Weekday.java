package time;

public enum Weekday {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	public Weekday getNextDay(){
		return getDaysAfter(1);
	}
	
	public Weekday getDaysAfter(int dayCount){
		//int weekdayCount = 7;
		int weekdayCount = Weekday.values().length;
		int nextDayIdx = (this.ordinal() + dayCount) % weekdayCount;  //magical constant
		return Weekday.values()[nextDayIdx];
	}
}