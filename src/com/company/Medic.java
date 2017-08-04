package com.company;

class Medic extends Unit {
    Medic(){
        name = "메딕";
        unitType = true;
        createdUnitSpeak();
    }
    int recoveryHP(int currentHP, int maxHP, String acceptUnitName, boolean unitType){
        if(unitType == true) {
            System.out.println("치료할 유닛 : " + acceptUnitName);

            System.out.println("메딕이 회복을 시작합니다.");
            for (int i = currentHP; currentHP < maxHP; i++) {
                currentHP++;
                System.out.println("현재 체력 : " + currentHP);
            }
            System.out.println("회복완료.");
            return currentHP;
        }
        else {
            System.out.println("생물이 아닙니다. 치료할 수 없습니다.");
            return -1;
        }
    }


}
