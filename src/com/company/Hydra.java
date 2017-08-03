package com.company;

public class Hydra extends Unit {
    private int power = 10;

    Hydra(){
        name = "히드라";
        createdUnitSpeak();
        printPower();
    }

    private void printPower(){
        System.out.println("히드라 공격력 : " + power);
    }

    int attackUnit(String unitName) {
        System.out.println("히드라 공격.");
        System.out.println("공격대상 : " + unitName);
        return power;
    }


}
