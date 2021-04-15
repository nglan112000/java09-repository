package utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.util.concurrent.TimeUnit;

import common.DateRange;
import common.DateTimeRange;
import common.DayOfWeek;
import common.TimeRange;

public class DayUtils {
	private DayUtils() {
		
	}
	
	public static String getDayOfWeek(int dow) {
		if(dow < 1 || dow > 7) {
			throw new RuntimeException("Day of week out of range (1-7)");
		}
		return DayOfWeek.values()[dow-1].name();
	}
	
	 public static TimeRange getDurations(Duration duration) {
		long durations = duration.getSeconds();
		long hours = TimeUnit.SECONDS.toHours(durations);
		duration = duration.minusHours(hours);
		long minutes = duration.toMinutes();
		duration = duration.minusMinutes(minutes);
		long seconds = duration.getSeconds();
		return new TimeRange(hours, minutes, seconds);
	 }
	 
	 public static DateTimeRange getDateTimeRange(LocalDateTime start, LocalDateTime end) {
		//B1: Convert to LocalDate, LocalTime
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();
		
		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();
		
		//B2:Calculate Period, Duration
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if (timeEnd.isBefore(timeStart)) {
			period = period.minusDays(1);
			if (period.getDays()<0) {
				period = period.minusMonths(1);
				int previousMonth = dateEnd.getMonthValue() - 1;
				int year = dateEnd.getYear();
				int days = YearMonth.of(year, previousMonth).lengthOfMonth() - 1;
				period = period.withDays(days);
				if (period.getMonths()<0) {
					period = period.minusYears(1);
					period = period.withMonths(11);
				}
			}
			duration = duration.plusDays(1);
		}
		
		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();
		DateRange dateRange = new DateRange(years, months, days);
		
		TimeRange timeRange = getDurations(duration);
		
		return DateTimeRange.builder()
				.withDateRange(dateRange)
				.withTimeRange(timeRange)
				.build();
	 }
}