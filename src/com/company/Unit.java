package com.company;
//1.추상화 공통의 속성이나 기능을 묶어 이름을 붙이는 것
//스타크레프트 각각의 유닛들을 공통으로 묶는 Unit 추상클래스
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
    //2.다형성 Overloading (과적재) Overriding(무효화 하다)
    //Overloading 하나의 함수에 여러개의 기능을 부여하는것
    //Overriding기존의 기능을 고려하지않고 새로운 기능을 부여

    interface OnCloakingListener{
        void onCloaking();
        void offCloaking();
    }

}
