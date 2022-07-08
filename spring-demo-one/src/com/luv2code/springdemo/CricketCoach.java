package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private  FortuneService fortuneService;

    //add new fields for emailAddress and team
    private  String emailAddress;
    private  String Team;

    //our setter method
    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        Team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    // create a no-arg constructor
    public  CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return Team;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
