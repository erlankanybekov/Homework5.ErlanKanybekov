package com.company;

import java.util.Random;

public class Boss {
    int health;
    int damage;
    int TypeDefence;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getTypeDefence() {
        return TypeDefence;
    }

    public void setTypeDefence(int typeDefence) {
        TypeDefence = typeDefence;

    }

    public void Defence() {
        Random random = new Random();
        int def = random.nextInt(5);
        if (def == 1){
            System.out.println("TypeDefence: Pyro kinesis");
        }
        if (def == 2){
            System.out.println("TypeDefence: Aero kinesis");
        }
        if ( def == 3){
            System.out.println("TypeDefence: Telekinesis");
        }
        if (def == 4){
            System.out.println("TypeDefence: Hydro kinesis");
        }
    }




}
