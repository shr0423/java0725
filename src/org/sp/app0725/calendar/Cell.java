package org.sp.app0725.calendar;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

//달력에 사용할 사각형 셀을 정의한다.
public class Cell extends JPanel{
	JLabel la_title;
	
	public Cell(Color color,int width, int height) {
		setPreferredSize(new Dimension(width,height));
		setBackground(color);
		
		la_title=new JLabel();
		//패널에 라벨부착
		this.add(la_title);
		
	}
	
	public void setTitle(String title) {
		la_title.setText(title);
		
	}
}
