package creature;

import java.util.Random;

public class PlayerCreature {
	
	public CreatureHabitats[] playerHabitats = new CreatureHabitats[2];
	public int Xp;
	public int Hp;
	public int Points;
	public Attributes attributes;
	public Stats stats;
	
	//Constructor
	public PlayerCreature() {
		//Creature Habitats size = 9
		Random r = new Random();
		int randomizer = r.nextInt(11);
		switch (randomizer) {
		case 0:
			playerHabitats[0] = CreatureHabitats.ShallowWater;
			break;		
		case 1:
			playerHabitats[0] = CreatureHabitats.DeepWater;
			break;
		case 2:
			playerHabitats[0] = CreatureHabitats.Air;
			break;
		case 3:
			playerHabitats[0] = CreatureHabitats.TreeTops;
			break;
		case 4:
			playerHabitats[0] = CreatureHabitats.Jungle;
			break;
		case 5:
			playerHabitats[0] = CreatureHabitats.Forest;
			break;
		case 6:
			playerHabitats[0] = CreatureHabitats.Grass;
			break;
		case 7:
			playerHabitats[0] = CreatureHabitats.Savana;
			break;
		case 8:
			playerHabitats[0] = CreatureHabitats.Mountain;
			break;
		case 9:
			playerHabitats[0] = CreatureHabitats.Cave;
			break;
		case 10:
			playerHabitats[0] = CreatureHabitats.Artic;
			break;
		}
		playerHabitats[1] = CreatureHabitats.Null;
		InitializeVars();
	}
	
	public PlayerCreature(CreatureHabitats habitat) {
		playerHabitats[0] = habitat;
		playerHabitats[1] = CreatureHabitats.Null;
		InitializeVars();
	}
	
	public PlayerCreature(CreatureHabitats habitat1, CreatureHabitats habitat2) {
		playerHabitats[0] = habitat1;
		playerHabitats[1] = habitat2;
		InitializeVars();
	}
	
	public void InitializeVars() {
		Xp = 0;
		Hp = 10;
		attributes = new Attributes();
		stats = new Stats();
		Points = 0;
	}
	
}
