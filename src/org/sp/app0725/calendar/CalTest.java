package org.sp.app0725.calendar;

import java.util.Calendar;

public class CalTest {
	
	public static void main(String[] args) {
		//날짜 객체 얻어오기(현재날짜가 디폴트로 지정되어있음)
		Calendar cal=Calendar.getInstance();
		
		//년도 구하기
		int yy=cal.get(Calendar.YEAR);
		int mm=cal.get(Calendar.MONTH);
		int dd=cal.get(Calendar.DATE);
		int day=cal.get(Calendar.DAY_OF_WEEK);
		
		//System.out.println(yy);
		//System.out.println(mm+1);
		//System.out.println(dd);
		//System.out.println(day);
		
		//날짜 조작해보기
		//1950.6.25
		cal.set(1950, 5, 25);
		
		//cal.set(Calendar.YEAR,1950);
		//cal.set(Calendar.MONTH,5);
		//cal.set(Calendar.DATE,25);
		System.out.println("육이오 발생 요일은 "+cal.get(Calendar.DAY_OF_WEEK));
		
	}
}
