package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Roller shewa = new Roller("Шева", 40000, 55, 13, 10, "скейткросс", "Tau");
        Roller bogdan = new Roller("Богдан", 30000, 76, 8, 9, "слайды", "SEBA");
        Roller sasha = new Roller("Саша", 20000, 65,8, 5, "слалом", "Hardcore");
        Roller vlad = new Roller("Влад", 15000, 73, 4, 0, "прыжки", "Flying Eagle");
        List<Roller> people = new ArrayList<>();
        people.add(shewa);
        people.add(bogdan);
        people.add(sasha);
        people.add(vlad);

        for (int i = 0; i < people.size(); i++) {
            for (int j = i; j < people.size(); j++) {
                if(people.get(i).getWaight() < people.get(j).getWaight()){
                    Roller bet = people.get(i);
                    people.set(i, people.get(j));
                    people.set(j, bet);
                }
            }
            System.out.println(people.get(i).getName() + ": " + people.get(i).getWaight());
        }
//        for (int i = 0; i < people.size(); i++) {
//           if(people.get(i).getExperience() > 5){
//               System.out.println(people.get(i).getName() + ": " + people.get(i).getExperience());
//           }
//        }
    }
}