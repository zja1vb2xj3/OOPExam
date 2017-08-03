package com.company;

class Tank extends Unit{

    private final int maxHP = 150;

    Tank() {
        super.hp = maxHP;
        super.unitType = false;
        super.name = "시즈탱크";
        createdUnitSpeak();
        printHP();
    }

    public int getMaxHP() {
        return maxHP;
    }
}
