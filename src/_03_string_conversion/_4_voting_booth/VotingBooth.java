package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {

		//Ask the user how old they are (in years)
		String ageInYears= JOptionPane.showInputDialog(null, "How old are you in years?");
		int ageAsInt=Integer.parseInt(ageInYears);
		//If they are over 18, ask them who the next president should be
		if(ageAsInt>18) {
			JOptionPane.showInputDialog(null, "Who should the next president be?");
		}
		else {
			JOptionPane.showMessageDialog(null,  "You are too young to vote.");
		}
		//If they are younger, tell them nobody cares what they think
}
}