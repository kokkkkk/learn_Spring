package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{

    private String[] fortuneOption = {"Happy","Sad","Normal"};
    private Random random = new Random();

    @Override
    public String getFortune(){
        int num = random.nextInt(3);
        return fortuneOption[num];
    }
}
