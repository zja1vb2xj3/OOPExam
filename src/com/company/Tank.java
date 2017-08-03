package com.company;

class Tank extends Unit {

    private final int maxHP = 150;

    Tank() {
        super.hp = maxHP;
        System.out.println("탱크가 생성 되었습니다.");
        printTankHP();
    }

    void printTankHP(){
        System.out.println("탱크 HP : " + hp);
    }


    @Override
    void increaseHP(int hp) {

    }

    @Override
    void decreaseHP(int hp) {

    }
}
