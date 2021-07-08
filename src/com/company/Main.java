package com.company;

public class Main {

	public static void main(String[] args) {
		Hero witcher = new Hero();
		witcher.setHealth(500);
		witcher.setDamage(90);
		witcher.setSuperPowerDamage(120);
		System.out.println("witcher: " + " health: " + witcher.getHealth() + ", damage: " + witcher.getDamage() +
				", powerDamage: " + witcher.getSuperPowerDamage());


		Boss Boss = new Boss();
		Boss.setHealth(500);
		Boss.setDamage(90);
		Boss.setTypeDefence(120);
		System.out.println("Boss: " + " health: " + Boss.getHealth() + ", damage: " + Boss.getDamage() +
				", TypeDefence: " + Boss.getTypeDefence());
		System.out.println("_____________________________________________________________");
		witcher.superpower();
		Boss.Defence();
	}


}






