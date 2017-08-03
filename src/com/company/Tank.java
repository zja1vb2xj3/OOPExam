package com.company;

class Tank extends Unit {

    private final int maxHP = 150;

    Tank() {
        super.hp = maxHP;
        super.name = "시즈탱크";
        System.out.println("탱크가 생성 되었습니다.");
        printHP();
    }

    @Override
    void increaseHP(int recoveryValue) {

    }

    @Override
    void decreaseHP(int damage) {

    }

    @Override
    void printHP() {
        System.out.println("탱크 HP : " + hp);
    }

}
