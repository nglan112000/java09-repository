package datetime.java08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime ldatetime = LocalDateTime.now();
		System.out.println("ldatetime :" + ldatetime );
		
		// convert LocalDateTime =>
		// + LocalDate
		// + LocalTime
		
		LocalDate ldate = ldatetime.toLocalDate();
		LocalTime ltime = ldatetime.toLocalTime();
		
		LocalDateTime attime = ldate.atTime(ltime);
		LocalDateTime atDate = ltime.atDate(ldate);
	}
}