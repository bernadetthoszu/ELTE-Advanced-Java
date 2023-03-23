package time;

public class WeekdayMain {
	public static void main(String[] args) {
		System.out.println(Weekday.TUESDAY.getNextDay());
		System.out.println(Weekday.TUESDAY.getNextDay().getNextDay());
	}
}
