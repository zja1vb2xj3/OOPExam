package com.company;

abstract class Unit {
    int hp;
    int mp;
    int transparency;
    int id;
    String name;
    boolean unitType;// true 라면 생물
    
    void printHP(){
        System.out.println(name + id + "의 HP : "+ hp);
    }

    public int getId() {
        return id;
    }

    public int getTransparency() {
        return transparency;
    }

    void createdUnitSpeak(){
        System.out.println(name + id + "이 생성되었습니다.");
    }

    void increaseHP(String unitName, int recoveryValue) {
        System.out.println(unitName + "의 체력이 증가합니다.");
        hp += recoveryValue;
        printHP();
    }

    void decreaseHP(String unitName, int damage) {
        System.out.println(unitName + id + "의 체력이 감소합니다.");
        hp -= damage;
        printHP();
    }

    interface OnCloakingListener{
        void onCloaking();
        void offCloaking();
    }

}
