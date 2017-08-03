package com.company;

class Marine extends Unit {
    private final int maxHP = 60;

    Marine(){
        super.hp = maxHP;
        System.out.println("탱크가 생성 되었습니다.");
        printHP();
    }

    void printHP(){
        System.out.println("마린 HP : " + hp);
    }


    @Override
    void increaseHP(int hp) {
        super.hp += hp;
    }

    @Override
    void decreaseHP(int hp) {
        super.hp -= hp;
    }
}
