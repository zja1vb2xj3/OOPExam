package com.company;

class Marine extends Unit implements Unit.OnChangedHP {
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

    @Override
    public void increaseHP(int recoveryValue) {
        System.out.println("마린이 체력이 증가합니다.");
        hp += recoveryValue;
        printHP();
    }

    @Override
    public void decreaseHP(int damage) {
        System.out.println("마린이 체력이 감소합니다.");
        super.hp -= damage;//피해만큼 체력에서 깎는다. 60 = 60 -10
        printHP();
    }

}
