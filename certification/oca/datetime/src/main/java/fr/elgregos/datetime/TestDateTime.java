package fr.elgregos.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TestDateTime {
	
	public static void main(String[] args) {
//		System.out.println(ZoneId.getAvailableZoneIds());
//		System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));
//		System.out.println(LocalDateTime.now(ZoneId.of("Europe/London")));
//		System.out.println(Instant.now());
//		System.out.println(LocalDateTime.now().plusYears(1).plusHours(2));
//		System.out.println(Period.parse("P4D").of(1492, 2,18).ofDays(2));
		
		TestDateTime testDateTime = new TestDateTime();
		testDateTime.formatDate(LocalDateTime.now());
		
	}
	
	public void formatDate(LocalDateTime localDateTime) {
		List<DateTimeFormatter> ldtFormatterList = new ArrayList<>();
		ldtFormatterList.add(DateTimeFormatter.BASIC_ISO_DATE);
		ldtFormatterList.add(DateTimeFormatter.ISO_LOCAL_TIME);
		ldtFormatterList.add(DateTimeFormatter.ISO_LOCAL_DATE);
		ldtFormatterList.add(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		ldtFormatterList.add(DateTimeFormatter.ISO_TIME);
		ldtFormatterList.add(DateTimeFormatter.ISO_DATE);
		ldtFormatterList.add(DateTimeFormatter.ISO_DATE_TIME);
		ldtFormatterList.add(DateTimeFormatter.ISO_ORDINAL_DATE);
		
		ldtFormatterList.forEach(l -> System.out.println(localDateTime.format(l)));
	}

}
