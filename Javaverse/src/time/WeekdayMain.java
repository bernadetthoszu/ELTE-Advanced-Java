package time;

public class WeekdayMain {
	public static void main(String[] args) {
		System.out.println(Weekday.TUESDAY.getNextDay());
		System.out.println(Weekday.TUESDAY.getNextDay().getNextDay());
		
//		System.out.println(Weekday.TUESDAY.getLang1Name());
//		System.out.println(Weekday.TUESDAY.getLang2Name());
		
		System.out.println(Weekday.TUESDAY.getName("hu"));
		System.out.println(Weekday.TUESDAY.getName("es"));
	}
}
