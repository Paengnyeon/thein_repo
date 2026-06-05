package com.pjw.day0605_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyMain3 {
	
public static void main(String[] args) {
	
	// LocalPC를 기준으로 날짜를 출력 
	LocalDate mylocalDate =LocalDate.now();
	System.out.println(mylocalDate);
	
	
	//Local PC를 기준으로 시간을 출력
	
	LocalTime mylocalTime = LocalTime.now();
	System.out.println(mylocalTime);
	
	System.out.println("==================");
	
//	Local PC를 기준으로 시간을 출력
	LocalDateTime myDateTime = LocalDateTime.now();
	System.out.println("날짜 시간: " + myDateTime);
	
	DateTimeFormatter myFormat = 
			DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
	

	String str = myDateTime.format(myFormat);
	System.out.println(str);
	}
}
