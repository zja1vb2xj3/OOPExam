package com.company;

class Marine extends Unit {
    private final int maxHP = 60;

    Marine(){
        super.name = "마린";
        super.hp = maxHP;
        super.maxHP = 60;
        System.out.println("마린가 생성 되었습니다.");
        printHP();
    }

    void printHP(){
        System.out.println("마린 HP : " + super.hp);
    }

    @Override
    void increaseHP(int recoveryValue) {
        System.out.println("마린이 체력이 증가합니다.");
        hp += recoveryValue;
        printHP();
    }

    @Override
    void decreaseHP(int damage) {
        System.out.println("마린이 체력이 감소합니다.");
        super.hp -= damage;//피해만큼 체력에서 깎는다. 60 = 60 -10
        printHP();
    }
}
