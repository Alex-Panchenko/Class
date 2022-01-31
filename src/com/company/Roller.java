package com.company;

public class Roller extends Athlete {
    private final String discipline;
    public final String model;

    public Roller(String name, int salary, int waight, int experience, int medals, String discipline, String model) {
        super(name, salary, waight, experience, medals);
        this.discipline = discipline;
        this.model = model;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Дисциплины: " + discipline + ", название роликов: " + model;
    }
}
