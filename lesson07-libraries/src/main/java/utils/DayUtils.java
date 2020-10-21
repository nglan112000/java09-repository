package utils;

import common.DayOfWeek;

public class DayUtils {
	private DayUtils() {
		
	}
	
	public static String getDayOfWeek(int dow) {
		if(dow < 1 || dow > 7) {
			throw new RuntimeException("Day of week out of range (1-7)");
		}
		return DayOfWeek.values()[dow-1].name();
	}
}
