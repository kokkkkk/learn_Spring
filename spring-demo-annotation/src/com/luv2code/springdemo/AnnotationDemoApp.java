package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args){

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());
        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
