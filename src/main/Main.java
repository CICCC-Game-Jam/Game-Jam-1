package main;

import java.util.ArrayList;

import creature.PlayerCreature;

public class Main {
	public static void main(String[] args) {
		PlayerCreature playerCreature = new PlayerCreature();
		System.out.println(playerCreature.Hp);
		System.out.println(playerCreature.Xp);
		System.out.println(playerCreature.attributes.Arms);
		System.out.println(playerCreature.stats.Endurance);
		ArrayList<PlayerCreature> grassArrayList = new ArrayList<PlayerCreature>();
		PlayerCreature player1 = new PlayerCreature();
		player1.Hp = 4;
		player1.Xp = 5;
		grassArrayList.add(player1);
	}
}
