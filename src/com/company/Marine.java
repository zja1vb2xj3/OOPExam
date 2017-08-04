package com.company;

class Marine extends Unit{
    private final int MAX_HP = 60;

    Marine(int id){
        super.name = "마린";
        super.id = id;
        super.unitType = true;
        super.hp = MAX_HP;
        createdUnitSpeak();
        printHP();
    }

    int getMaxHP() {
        return MAX_HP;
    }


}
