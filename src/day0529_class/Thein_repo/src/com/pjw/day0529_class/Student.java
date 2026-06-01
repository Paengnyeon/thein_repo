package com.pjw.day0529_class;

/*
 * [Student 클래스]
 *
 * 학생 한 명의 정보를 담는 설계도이다.
 * name, age, major라는 값을 가지고 있다.
 */
public class Student {

    String name;
    int age;
    String major;

    // 기본 생성자: 아무 값도 안 넣고 만들 때 실행된다.
    public Student() {
        name = "알 수 없음";
        age = 0;
        major = "전공 미정";
    }

    // 이름만 받는 생성자
    public Student(String studentName) {
        name = studentName;
        age = 18;
        major = "전공 미정";
    }

    // 이름과 나이를 받는 생성자
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
        major = "전공 미정";
    }

    // 이름, 나이, 전공을 모두 받는 생성자
    public Student(String studentName, int studentAge, String studentMajor) {
        name = studentName;
        age = studentAge;
        major = studentMajor;
    }

    public void displayInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 전공: " + major);
    }

    public void changeMajor(String newMajor) {
        major = newMajor;
        System.out.println(name + "의 전공이 " + newMajor + "으로 변경되었습니다.");
    }
}
