package com.company;

public class Athlete extends Human {
    int experience;
    int medals;

    public Athlete(String name, int salary, int waight, int experience, int medals) {
        super(name, salary, waight);
        this.experience = experience;
        this.medals = medals;
    }

    public int getExperience() {
        return experience;
    }

    public int getMedals() {
        return medals;
    }

}
