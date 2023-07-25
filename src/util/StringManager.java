package util;

public class StringManager {
	//문자열의 길이가 1 인경우, 2자리로 표현하기
	//7인경우 07
	public static String getNumString(int n) {
		String str=Integer.toString(n);
		
		
		if(str.length()<2) {//문자열 길이가 1이라면..
			str="0"+str;
		}
		return str;
		
	}
}
