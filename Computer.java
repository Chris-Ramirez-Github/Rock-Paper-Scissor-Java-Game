
public class Computer {
	String name = "CPU";
	String choice;
	int score;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
 
	public void printDetails() {
		System.out.println("\n" + "Computer Name: " + name + "\n" + "Score: " + + score + "\n" + "Choice: "  + choice + "\n");
	}
}
