package choices;

public class Options {

	CreatureHabitats[] creatureHabitats;
	CreatureHabitats cHabitats;
	private PlayerCreature inputPlayer;
	
	public void setInputPlayer(PlayerCreature input) {
		this.inputPlayer = input;
	}
	
	/*
	 * Constructor
	 */
	public Options() {
		creatureHabitats = new CreatureHabitats[10];
		
		switch (inputPlayer.playerHabitats[0]){
		
		case Air:
			
			break;
		
		default:
			break;
		
		
		}
		
		
		
	}
	
}
