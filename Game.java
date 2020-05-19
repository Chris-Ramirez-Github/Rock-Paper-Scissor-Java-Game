//import java.security.SecureRandom;
import java.util.*;

public class Game {
	//SecureRandom rand = new SecureRandom();
	Scanner kb = new Scanner(System.in);
	
	
	
	Computer cpu = new Computer();
	Player user = new Player();
	Hand cpu_hand = new Hand();
	Hand user_hand = new Hand();
	//String[] hand = {"Rock","Paper","Scissor"};
	
	int rand_Choice;
	String user_Choice;
	String computerHand;
	String name;
	int user_Score = 0;
	int cpu_Score = 0;
	String ui;
	
	public void playGame() {
		
		System.out.println();
		
		System.out.println("Please ENTER Gamer tag: ");
		 name = kb.nextLine();
		 user.setName(name);
		 
		 
		
//		System.out.println(user_hand);
//		
//		System.out.println(computerHand);
//		
//		System.out.println(user_hand.equalsIgnoreCase(computerHand));
		
		do {
			
			System.out.println("Make your Choice: Enter number value 0-Rock/1-Paper/2-Scissor");
			user_Choice = user_hand.dealHand();//hand[rand_Choice = rand.nextInt(3)];
			System.out.println();
			user.setChoice(user_Choice);
			computerHand = cpu_hand.dealHand();
			cpu.setChoice(computerHand);
			
		if (user_Choice.equalsIgnoreCase(computerHand) == true) {
			System.out.println("It's a tie!");
			System.out.println("**No points added**");
			user.setScore(user_Score);
			cpu.setScore(cpu_Score);
			
			user.printDetails();
			cpu.printDetails();
			
		}
		if(user_Choice.equalsIgnoreCase(computerHand) == false) {
			if(user_Choice.equalsIgnoreCase("Rock") == true) {
					if(computerHand.equalsIgnoreCase("Paper") == true) {
						System.out.println(cpu.getName() + " Won Match!");
				
						cpu_Score = cpu_Score +1; 
						cpu.setScore(cpu_Score);
						
						user.printDetails();
						cpu.printDetails();
						
			}
					if(computerHand.equalsIgnoreCase("Scissor") == true) {
						System.out.println(user.getName() + " Won Match!");
					
						user_Score = user_Score + 1; 
						user.setScore(user_Score);
						
						user.printDetails();
						cpu.printDetails();
			}
		}
		
			if(user_Choice.equalsIgnoreCase("Paper") == true) {
					if(computerHand.equalsIgnoreCase("Rock") == true) {
						System.out.println(user.getName() + " Won Match!");
						user_Score = user_Score + 1; 
						user.setScore(user_Score);
						
						user.printDetails();
						cpu.printDetails();
			}
					if(computerHand.equalsIgnoreCase("Scissor") == true) {
						System.out.println(cpu.getName() + " Won Match!");
						cpu_Score = cpu_Score +1; 
						cpu.setScore(cpu_Score);
						
						user.printDetails();
						cpu.printDetails();
			}
		}
	
		   if(user_Choice.equalsIgnoreCase("Scissor") == true) {
			   		if(computerHand.equalsIgnoreCase("Rock") == true) {
						System.out.println(cpu.getName() + " Won Match!");
						cpu_Score = cpu_Score +1; 
						cpu.setScore(cpu_Score);
						
						user.printDetails();
						cpu.printDetails();
			}
			   		if(computerHand.equalsIgnoreCase("Paper") == true) {
						System.out.println(user.getName() + " Won Match!");
						user_Score = user_Score +1; 
						user.setScore(user_Score);
						user.printDetails();
						cpu.printDetails();
			}
			   		
		}
		   }
		
		System.out.println("Do you want to exit? Enter Y - exit or N - continue:");
		ui = kb.nextLine();
		if(ui.equalsIgnoreCase("y")==true) {
			break;
		}
		
	
		
		
	}while(((user.getScore() < 10) && (cpu.getScore() < 10)));
						System.out.println("********************************************");
						System.out.println("\t\tGame Over");
						System.out.println();

						if(user.getScore()==cpu.getScore()) {
							System.out.println("Game was a Tie!");	
							System.out.println("Final score:\n" + user.getName() + " " + user.getScore() + "\n" 
									+ cpu.getName() + " " + cpu.getScore());
						}
						if(user.getScore()>cpu.getScore()) {
							System.out.println(user.getName() + " Won Game!");
							
							System.out.println("Final score:\n" + user.getName() + " " + user.getScore() + "\n" 
							+ cpu.getName() + " " + cpu.getScore());

						}
						if(cpu.getScore()>user.getScore()) {
							System.out.println("CPU Won Game!");
							System.out.println("Final score:\n" + user.getName() + " " + user.getScore() + "\n" 
									+ cpu.getName() + " " + cpu.getScore());
						}
						
						
						System.out.println("********************************************");
		
		kb.close();
		
	}


	
}
