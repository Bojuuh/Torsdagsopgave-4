import java.util.ArrayList;
import java.util.Scanner;

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

	public String getAction(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number to choose an action");
		displayMenu();
		String choice = scanner.nextLine();
		return choice;
		}

}