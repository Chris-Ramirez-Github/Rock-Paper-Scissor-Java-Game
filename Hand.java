import java.security.SecureRandom;

public class Hand {
	SecureRandom rand = new SecureRandom();
	String[] hand = {"Rock","Paper","Scissor"};
	int rand_Choice;
	String choice;
	
	public String dealHand(){
		choice = hand[rand_Choice = rand.nextInt(3)];
		return choice;
	}
}

