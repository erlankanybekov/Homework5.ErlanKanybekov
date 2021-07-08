package com.company;

import java.util.WeakHashMap;

public class Main {

	public static void main(String[] args) {
		Hero witcher = new Hero();
		witcher.setHealth(500);
		witcher.setDamage(45);
		witcher.setSuperPowerDamage(120);
		System.out.println("witcher: " + " health: " + witcher.getHealth() + ", damage: " + witcher.getDamage() +
				", powerDamage: " + witcher.getSuperPowerDamage());


		Boss Boss = new Boss();
		Boss.setHealth(500);
		Boss.setDamage(43);
		Boss.setTypeDefence(120);
		System.out.println("Boss: " + " health: " + Boss.getHealth() + ", damage: " + Boss.getDamage() +
				", TypeDefence: " + Boss.getTypeDefence());
		System.out.println("_____________________________________________________________");
		int	fight = 0;

		while (fight < 5){
			fight = fight + 1;
			witcher.health = witcher.health - Boss.damage;
			System.out.println("Witcher health: " + witcher.health);
			Boss.health = Boss.health - witcher.damage;
			System.out.println("Boss health: "+ Boss.health);
			System.out.println("_______________________________________________");
			witcher.superpower();

			Boss.Defence();
			System.out.println("________________________________________________");
		}
		if (witcher.health < 0){
			System.out.println("Boss won");
		} else {
			System.out.println("witcher won");
		}
	}


}







