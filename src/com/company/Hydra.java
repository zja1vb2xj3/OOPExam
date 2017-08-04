package com.company;

public class Hydra extends Unit {
    private int power = 10;

    Hydra(int id){
        super.name = "히드라";
        super.id = id;
        super.unitType = true;
        createdUnitSpeak();
        printPower();
    }

    private void printPower(){
        System.out.println("히드라"+ id +"의 공격력 : " + power);
    }

    int attackUnit(String unitName, int id) {
        System.out.println("히드라 공격. 대상 : " + unitName + id);

        return power;
    }


}
