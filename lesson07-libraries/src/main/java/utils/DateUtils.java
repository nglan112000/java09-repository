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
import common.TimeRange;

public class DateUtils {
	private DateUtils() {

	}

	public static String getDayOfWeek(int dow) {
		if (dow < 1 || dow > 7) {
			throw new RuntimeException("day of week out of range(1-7)");
		}
		return common.DayOfWeek.values()[dow - 1].name();
	}

	public static TimeRange getDurations(Duration duration) {
		long durations = duration.getSeconds();
		long hour = TimeUnit.SECONDS.toHours(durations);
		duration = duration.minusHours(hour);
		long minutes = duration.toMinutes();
		long seconds = duration.minusMinutes(minutes).getSeconds();

		return new TimeRange(hour, minutes, seconds);
	}

	public static DateTimeRange getDateTimeRange(LocalDateTime start, LocalDateTime end) {

		// b1:covert to Localdate va localtime
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();

		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();

		// b2:caculate period,duration
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);

		if (timeEnd.isBefore(timeStart)) {
			period = period.minusDays(1);
		

			if (period.getDays() < 0) {
				
				period = period.minusMonths(1);
				
				int previousMonth=dateEnd.getMonthValue()-1;
				int year = dateEnd.getYear();
				int days = YearMonth.of(year, previousMonth).lengthOfMonth() - 1;
				period = period.withDays(days);

				if (period.getMonths() < 0) {
					period=period.minusYears(1);
					period=period.withMonths(11);
					
				} else {

				

				}
			}
			duration = duration.plusDays(1);
		}

		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();

		DateRange dateRange = new DateRange(years, months, days);
		TimeRange timeRange = getDurations(duration);

		return DateTimeRange.builder().withDateRange(dateRange).withTimeRange(timeRange).build();

	}

}