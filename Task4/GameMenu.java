import java.util.ArrayList;

class GameMenu{

	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;

	}

	public void displayMenu(){
		System.out.println("Game Menu:");
		for (int i = 0; i < actions.size(); i++){
			System.out.println((i + 1) + ". " + actions.get(i));
		}
	}
}