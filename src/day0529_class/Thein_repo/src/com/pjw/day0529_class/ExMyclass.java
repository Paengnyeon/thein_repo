package com.pjw.day0529_class;

/*
 * [클래스 사용하기]
 *
 * new 키워드는 클래스를 실제 객체로 만드는 키워드이다.
 */
public class ExMyclass {

    public static void main(String[] args) {

        MyPoint myPoint = new MyPoint();
        myPoint.MyStr();

        Students st01 = new Students();
        System.out.println(st01.getStName());
        st01.setStName("새로 전학온 홍길동");
        st01.myprint();

        Student student1 = new Student();
        Student student2 = new Student("알리스");
        Student student3 = new Student("밥", 20);
        Student student4 = new Student("캐롤", 19, "컴퓨터과학");

        System.out.println("=== 학생 정보 ===");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();

        System.out.println();
        System.out.println("=== 변경 후 ===");
        student2.changeMajor("수학");
        student3.changeMajor("물리학");

        System.out.println();
        System.out.println("=== 변경된 학생 정보 ===");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}
