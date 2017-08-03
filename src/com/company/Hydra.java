package com.company;

public class Hydra {
    private int power = 10;

    Hydra(){
        System.out.println("히드라가 생성되었습니다.");;
        printPower();
    }

    private void printPower(){
        System.out.println("히드라 공격력 : " + power);
    }

    int attackUnit(int hp) {
        hp -= power;
        return hp;
    }
}
