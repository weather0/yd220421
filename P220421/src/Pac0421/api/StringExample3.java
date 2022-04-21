package Pac0421.api;

import java.util.Calendar;
import java.util.Scanner;

public class StringExample3 {
	public static void main(String[] args) {
		// 주민번호 => 생년월일-남/여

		// 950405-2345678 => 95년 4월 5일생, 여자입니다
		// 991001-1234567 => 99년 10월 1일생, 남자입니다
		// 9704051234567 => 97년 4월 5일생, 남자입니다
		// 0505053456789 => 05년 5월 5일생, 남자입니다

		String result = checkInfo(null);
		System.out.println(result);

	}

	public static String checkInfo(String jumin) {
		// 기능구현
		System.out.println("주민번호입력>>");
		Scanner scn = new Scanner(System.in);
		String num = scn.nextLine();

		String year = num.substring(0, 2);
		String month = num.substring(2, 4);
		String day = num.substring(4, 6);
		String gender = num.substring(num.length() - 7, num.length() - 6);
		if (gender.equals("1") || gender.equals("3")) {
			gender = "남자";
		} else {
			gender = "여자";
		}
		String aaa = new String(jumin);
		return aaa;
//		return (year + "년 " + month + "월 " + day + "일생, " + gender + "입니다");
	}

}
