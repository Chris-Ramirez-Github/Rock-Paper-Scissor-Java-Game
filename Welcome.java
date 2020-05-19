import java.util.*;


public class Welcome {
	String ui;
	Scanner kb = new Scanner(System.in);
	
	
	public String getUi() {
		return ui;
	}


	public void setUi(String ui) {
		this.ui = ui;
	}
 

	public String WelcomeScreen(){
		
		System.out.println("Welcome to Rock Paper Scissor Game!");
		System.out.println("********************************************");
		System.out.println();
		System.out.println("Do you want play Rock, Paper, Scissor (Y - Yes/N - no): ");
		return ui = kb.nextLine();
		 
		 
		
		
	}

}
