package com.company;

abstract class Unit {
    int hp;
    String name;

    void printHP(){
        System.out.println(name + "의 HP : "+ hp);
    }

    void createdUnitSpeak(){
        System.out.println(name + " 이(가) 생성되었습니다.");
    }

    //추상 메소드로 구현하지않고 추상 클래스에서 interface로 구현한 이유 :
    //추상 메소드로 구현하게 되면 구현할 필요가 없는 자식 클래스에서도 추상 메소드를 구현해줘야한다.

    interface OnChangedHP{
        void increaseHP(int recoveryValue);
        void decreaseHP(int damage);
    }

}
