package com.company;

class Medic extends Unit {
    Medic(){
        name = "메딕";
        createdUnitSpeak();
    }
    int recoveryHP(int currentHP, int maxHP, String unitName){
        System.out.println("치료할 유닛 : " + unitName);
        System.out.println("유닛의 치료 전 HP : " + currentHP);
        System.out.println("메딕이 회복을 시작합니다.");
        for(int i=currentHP; currentHP<maxHP; i++){
            currentHP++;
            System.out.println("회복한 체력 : " + currentHP);
        }
        System.out.println("회복완료.");
        return currentHP;
    }


}
