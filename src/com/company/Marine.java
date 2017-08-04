package com.company;
//3.상속 Class의 변수, 메서드를 다른 Class에 물려주거나 물려 받는 것을 말한다
//이를통해서 코드 재사용을 증대 시킬수 있다 같은 기능을 또 구현할 필요가 없다 + 추가 구현가능

class Marine extends Unit{
    private final int MAX_HP = 60;
    //4.캡슐화
    //클래스,메서드,변수의 접근제한을 최대한 제한되게 한다.
    //이유:외부에서 접근 할 필요가 없는 동작 및 데이터는 접근되게 해서는 안된다.
    //협업에 필요

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
