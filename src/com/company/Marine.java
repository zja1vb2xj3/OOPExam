package com.company;

class Marine extends Unit{
    private final int maxHP = 60;

    Marine(){
        super.name = "마린";
        super.hp = maxHP;
        createdUnitSpeak();
        printHP();
    }

    int getMaxHP() {
        return maxHP;
    }


}
