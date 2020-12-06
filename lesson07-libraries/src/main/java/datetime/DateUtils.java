package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.util.concurrent.TimeUnit;

import common.DateRange;
import common.DateTimeRange;
import common.DayOfWeek;
import common.TimeRange;
import datetime.java08.*;

public class DateUtils {
	private DateUtils() {

	}

	public static String getDayOfWeek(int dow) {
		if (dow < 1 || dow > 7) {
			throw new RuntimeException("Day of week out of range(1-7)");
		}
		return DayOfWeek.values()[dow - 1].name();

	}

	public static TimeRange getDurations(Duration duration) {
		long durations = duration.getSeconds();
		long hour = TimeUnit.SECONDS.toHours(durations);
		duration = duration.minusHours(hour);
		long minute = duration.toMinutes();
		long second = duration.minusMinutes(minute).getSeconds();
		return new TimeRange(hour, minute, second);

	}

	public static DateTimeRange getdateTimeRange(LocalDateTime start, LocalDateTime end) {
		// LocalDateTime start = LocalDateTime.of(2020, Month.APRIL, 20, 10, 20, 30);
		// LocalDateTime end = LocalDateTime.of(2020, Month.JUNE, 22, 12, 05, 30);
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();
		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();
		// calcula period ,duration

		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		if (timeEnd.isBefore(timeStart)) {
			period = period.minusDays(1);

			if (period.getDays() < 0) {
				period = period.minusMonths(1);
				int preMonth = dateEnd.getMonthValue() - 1;
				int days = YearMonth.of(dateEnd.getYear(), preMonth).lengthOfMonth() - 1;
				period = period.withDays(days);
				
				// same month
				if (period.getMonths() < 0) {
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
		return DateTimeRange.builder().withDateRange(dateRange).withTimeRange(timeRange).build();
	}

}