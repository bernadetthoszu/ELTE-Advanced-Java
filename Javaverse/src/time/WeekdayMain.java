package time;

public class WeekdayMain {
	public static void main(String[] args) {
		System.out.println(Weekday.TUESDAY.getNextDay());
		System.out.println(Weekday.TUESDAY.getNextDay().getNextDay());
		
//		System.out.println(Weekday.TUESDAY.getLang1Name());
//		System.out.println(Weekday.TUESDAY.getLang2Name());
		
		System.out.println(Weekday.TUESDAY.getName("hu"));
		System.out.println(Weekday.TUESDAY.getName("es"));
		System.out.println(Weekday.SATURDAY.getName("es"));
		System.out.println(Weekday.FRIDAY.getName("hu"));
		
		System.out.println(Weekday2.TUESDAY.getName("hu"));
		System.out.println(Weekday2.TUESDAY.getNextDay().getName("es"));
		System.out.println(Weekday2.TUESDAY.getNextDay().getName("de"));
		
	}
}
