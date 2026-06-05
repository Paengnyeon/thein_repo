package com.pjw.day0605;

public class MyMain1 {

    public static void main(String[] args) {

        Greeting greet = new Greeting() {

        	
        	
            @Override
            public void sayHello() {
                System.out.println("익명클래스");
            }
        };

        greet.sayHello();
    }
}