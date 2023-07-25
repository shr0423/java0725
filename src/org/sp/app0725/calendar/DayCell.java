package org.sp.app0725.calendar;

import java.awt.Color;

//요일을 표현할 박스 정의
public class DayCell extends Cell{

	
	public DayCell(Color color,int width, int height) {
		super(color,width,height);//부모의 초기화
		
		la_title.setForeground(Color.WHITE);//폰트색상
		
	}
}
