package com.company;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();

        Marine marine = new Marine();

        Hydra hydra = new Hydra();

        int damage = hydra.attackUnit(marine.name);
        marine.decreaseHP(damage);

        Medic medic = new Medic();
        medic.recoveryHP(marine.hp, marine.getMaxHP(),marine.name);
    }
}
