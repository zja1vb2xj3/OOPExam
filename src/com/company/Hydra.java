package com.company;

public class Hydra extends Unit {
    private int power = 10;

    Hydra(){
        System.out.println("히드라가 생성되었습니다.");;
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


    @Override
    void increaseHP(int recoveryValue) {

    }

    @Override
    void decreaseHP(int damage) {

    }

    @Override
    void printHP() {

    }
}
