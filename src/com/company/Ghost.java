package com.company;

public class Ghost extends Unit implements Unit.OnCloakingListener {
    private final int MAX_HP = 45;
    Ghost(int id) {
        super.hp = MAX_HP;
        super.unitType = true;
        super.name = "고스트";
        super.transparency = 100;
        super.id = id;
        createdUnitSpeak();
        printHP();
    }

    @Override
    public void onCloaking() {
        transparency = 0;
        System.out.println(name+id + " 투명도 : " + transparency);
    }

    @Override
    public void offCloaking() {
        transparency = 100;
        System.out.println(name+id + " 투명도 : " + transparency);
    }
}
