package com.company;

public class Main {
    public static void main(String[] args) {
        Marine marine = new Marine();

        Hydra hydra = new Hydra();

        int damage = hydra.attackUnit(marine.name);
        marine.decreaseHP(marine.name, damage);
        damage = 0;
        Medic medic = new Medic();

        int recoveredHP = medic.recoveryHP(marine.hp, marine.getMaxHP(), marine.name, marine.unitType);
        marine.increaseHP(marine.name, recoveredHP-marine.hp);

        Tank tank = new Tank();

        damage += hydra.attackUnit(tank.name);
        damage += hydra.attackUnit(tank.name);

        tank.decreaseHP(tank.name, damage);
        //메딕은 사람만 치료가능 //SCV는 기계만 치료가능
        Scv scv = new Scv();
        recoveredHP = scv.repairHP(tank.hp, tank.getMaxHP(), tank.name, tank.unitType);
        tank.increaseHP(tank.name, recoveredHP-tank.hp);
    }



}
