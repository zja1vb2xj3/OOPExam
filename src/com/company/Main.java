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

        if(recoveredHP != -1)
        marine.increaseHP(marine.name, recoveredHP-marine.hp);

        Tank tank = new Tank();

        damage += hydra.attackUnit(tank.name);
        damage += hydra.attackUnit(tank.name);

        tank.decreaseHP(tank.name, damage);

        Scv scv = new Scv();

        recoveredHP = scv.repairHP(tank.hp, tank.getMaxHP(), tank.name, tank.unitType);

        if(recoveredHP != -1)
        tank.increaseHP(tank.name, recoveredHP-tank.hp);

        //scv는 기계 타입만 수리가능
        scv.repairHP(marine.hp, marine.getMaxHP(), marine.name, marine.unitType);
        //medic은 생물만 치료가능
        medic.recoveryHP(tank.hp, tank.getMaxHP(), tank.name, tank.unitType);
    }



}
