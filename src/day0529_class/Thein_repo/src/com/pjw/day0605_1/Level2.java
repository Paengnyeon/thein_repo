package com.pjw.day0605_1;

enum Level2 {

	LOW("Low level"),
	MEDIUM("Medium level"),
	HIGH("High level");

	// enum 사용할변수
	private String description;

	// enum 생성자
	private Level2(String description) {
		this.description = description;
	}

	// eum 게터
	public String getDescription() {
		return description;
	}

}