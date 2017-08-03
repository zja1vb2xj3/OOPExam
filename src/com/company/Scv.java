package com.company;

class Scv extends Unit {
    Scv(){
        super.name = "SCV";
        super.unitType = true;
        createdUnitSpeak();
    }
    int repairHP(int currentHP, int maxHP, String acceptUnitName, boolean unitType) {
        if (unitType == false) {
            System.out.println("치료할 유닛 : " + acceptUnitName);

            System.out.println("SCV가 수리를 시작합니다.");
            for (int i = currentHP; currentHP < maxHP; i++) {
                currentHP++;
                System.out.println("현재 체력 : " + currentHP);
            }
            System.out.println("회복완료.");
            return currentHP;
        }

        else {
            System.out.println("기계가 아닙니다. 치료할 수 없습니다.");
            return -1;
        }
    }

}


