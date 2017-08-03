package com.company;

class Tank extends Unit{

    private final int maxHP = 150;

    Tank() {
        super.hp = maxHP;
        super.name = "시즈탱크";
        createdUnitSpeak();
        printHP();
    }


}
