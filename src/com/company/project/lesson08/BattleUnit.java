package com.company.project.lesson08;

public class BattleUnit extends Unit{

    private  int attackPoint;

    public BattleUnit(int healthPoint, int speedPoint, int attackPoint) {
        super(healthPoint);
        this.attackPoint= attackPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void attack(BattleUnit unit){

    }

    @Override
    public void rest() {
        if(healthPoint > 0 && initialHealthPoint > healthPoint ){
            healthPoint+=2;


        }
    }
}
