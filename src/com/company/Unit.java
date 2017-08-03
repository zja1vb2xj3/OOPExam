package com.company;

abstract class Unit {
    int hp;
    String name;

    void printHP(){
        System.out.println(name + "의 HP : "+ hp);
    }

    void createdUnitSpeak(){
        System.out.println(name + " 이(가) 생성되었습니다.");
    }

    void increaseHP(String unitName, int recoveryValue) {
        System.out.println(unitName + " 의 체력이 증가합니다.");
        hp += recoveryValue;
        printHP();
    }

    void decreaseHP(String unitName, int damage) {
        System.out.println(unitName + " 의 체력이 감소합니다.");
        hp -= damage;
        printHP();
    }

}
