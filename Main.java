/**
	 * @author Chris Ramirez
	 * @date March 01, 2020
	 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//calling and creating objects
		Welcome welcome = new Welcome();
		GoodBye goodbye = new GoodBye();
		Game play = new Game();
		
		
		//Declaring local variable
		String ui = "";
		
		
		System.out.println("********************************************");
		
		//user input to play game or not
		ui=welcome.WelcomeScreen();

		
		
		//if yes then the game is played
	if (ui.toLowerCase().startsWith("y")){	
			play.playGame();
		}
		//else exit program
	else if (ui.toLowerCase().startsWith("n")){
				goodbye.GoodByeScreen();
		}
	else{
				goodbye.GoodByeScreen();
		}
	
	}
	

}
