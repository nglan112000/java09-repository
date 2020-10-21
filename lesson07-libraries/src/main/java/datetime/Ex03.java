package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex03 {
	public static void main(String[] args) {
		//start : 20/04/2020 10:20:30
		//now : current time
		Calendar cstart = Calendar.getInstance();
		cstart.set(2020,Calendar.APRIL, 20, 10, 20,30);
		Calendar cnow = Calendar.getInstance();
		
		if (cnow.before(cstart)) {
			throw new RuntimeException("Invalid time range");
		}
		
	    long start	= cstart.getTimeInMillis();
	    long now = cnow.getTimeInMillis();
	    
	    long duration = now - start;
	    long days = TimeUnit.MILLISECONDS.toDays(duration);
	    
	    long remainingHours = duration - TimeUnit.DAYS.toMillis(days);
	    long hours = TimeUnit.MILLISECONDS.toHours(remainingHours);
	    
	    long remainingMinutes = remainingHours - TimeUnit.HOURS.toMillis(hours);
	    long minute = TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);
	    
	    long remainingSecond = remainingMinutes - TimeUnit.MINUTES.toMillis(minute);
	    long second = TimeUnit.MILLISECONDS.toSeconds(remainingSecond);
	    System.out.println(days + "-" + hours + "-" + minute + "-" + second);
	}
}
