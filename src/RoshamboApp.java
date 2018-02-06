import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int humanChoice;
		int teamPick;
		Player rT = new RandomPlayer();
		Player rock = new RockPlayer();

		System.out.println("Welcome to Roshambo");
		System.out.println("\nPlease enter your name");
		String userName = scan.nextLine();
		//
		System.out.println("Hello " + userName + ", who would you like to player with?");
		do {
		System.out.println("Press 1 for the RockTeam, 2 for the RandomThreat, 3 to quit (1/2)");
		teamPick = scan.nextInt();
		
		
		System.out.println("Now its time to play ROSHAMBO!");
		
		if (teamPick == 1) {
			do {
			System.out.println("\nPress the number to pick Rock(1), Paper(2), Scissors(3), quit(4)");
			humanChoice = scan.nextInt();

			switch (humanChoice) {

			case 1:
				System.out.println(userName + ": Rock");
				rock.getName();
				rock.shoot();
				break;
			case 2:
				System.out.println(userName + ": Paper");
				rock.getName();
				rock.shoot();
				break;
			case 3:
				System.out.println(userName + ": Scissors");
				rock.getName();
				rock.shoot();
				break;
			}
			}while(humanChoice != 4);
			}


		else if (teamPick == 2) {
			do {
			//System.out.println("Now its time to play ROSHAMBO!");
			System.out.println("\nPress the number to pick Rock(1), Paper(2), Scissors(3), quit(4)");
			humanChoice = scan.nextInt();

			switch (humanChoice) {

			case 1:
				System.out.println(userName + ": Rock");
				rT.getName();
				rT.shoot();
				break;
			case 2:
				System.out.println(userName + ": Paper");
				rT.getName();
				rT.shoot();
				break;
			case 3:
				System.out.println(userName + ": Scissors");
				rT.getName();
				rT.shoot();
				break;
			}
			}while(humanChoice != 4);
			}

		}while(teamPick != 3);
		
		System.out.println("GoodBye");
	}

}
