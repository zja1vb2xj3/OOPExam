package com.company;

abstract class Unit {
    int hp;
    int maxHP;
    String name;
    abstract void increaseHP(int recoveryValue);
    abstract void decreaseHP(int damage);
    abstract void printHP();

    public int getHp() {
        return hp;
    }

    public void setHp(int damage) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

}
