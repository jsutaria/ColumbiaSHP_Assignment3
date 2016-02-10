import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		
		int score = 0;
		int compscore = 0;
		int move = 0;
		int compmove = 0;
		
		while (score < 5 && compscore < 5) {
			System.out.print("Enter your move (0 for rock, 1 for paper, or 2 for scissors): ");
			move = Input();
			compmove = (int )(Math.random() * 3);
			System.out.println(compmove);
			if (compmove == move + 1 || compmove == move - 2) {
				compscore = compscore + 1;
				System.out.println("Computer Wins This Round!");
			}
			if (move == compmove + 1 || move == compmove - 2) {
				score = score + 1;
				System.out.println("User Wins This Round!");
			}
			if (compmove == move) {
				System.out.println("This Round was a tie!");
			}
			
			System.out.println("The Score is:");
			System.out.println("Comp: " + compscore);
			System.out.println("User: " + score);
			System.out.println("");
		
		}
		
		if (score == 5) {
			System.out.println("Yo Win The Game!");
		}
		else {
			System.out.println("The Computer Wins The Game!");
		}
	}
	
	public static int Input() {
		int moves;
		Scanner reader = new Scanner(System.in);
		moves = reader.nextInt();
		if (moves > 2 || moves < 0) {
			System.out.println("Please enter only 0, 1, or 2: ");
			Input();
		}
		reader.close();
		return moves;
	}
	
}
