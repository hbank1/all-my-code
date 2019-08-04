import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class leapyearcalender {
	@Test
	public void testisleapyear() {
		assertTrue(isLeapYear(2016));
		assertTrue(isLeapYear(2000));
		assertFalse(isLeapYear(2001));
		assertFalse(isLeapYear(1700));
		assertFalse(isLeapYear(1701));
		assertTrue(isLeapYear(1704));
		assertTrue(isLeapYear(10000));
		assertTrue(isLeapYear(0));
	}
	
public boolean isLeapYear(int year) {
	int r = year%4;
	if(r==0) {
		int div100 = year%100;
		int div400 = year%400;
		if(div100==0&&div400==0) {
			return true;
		}
		if(div400!=0&&div100==0) {
			return false;
		}
		return true;
	}
	else {
		return false;
	}
}
}
