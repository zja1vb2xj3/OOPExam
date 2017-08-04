package com.company;

class Tank extends Unit{

    private final int MAX_HP = 150;

    Tank(int id) {
        super.hp = MAX_HP;
        super.unitType = false;
        super.name = "시즈탱크";
        super.id = id;
        createdUnitSpeak();
        printHP();
    }

    public int getMaxHP() {
        return MAX_HP;
    }
}
