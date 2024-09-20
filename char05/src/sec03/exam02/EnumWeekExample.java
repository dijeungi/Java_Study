package sec03.exam02;

import java.util.Calendar;

import sec03.exam01.Week;

public class EnumWeekExample {
	public static void main(String[] args) {

		Week today = null;
		
		Calender cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		}

	}

}
