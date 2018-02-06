
public class RandomPlayer extends Player {

	public RandomPlayer() {

	}

	@Override
	public void getName() {
		//name = "RandomThreat";
		System.out.print("RockPlayer: ");
		
	}

	@Override
	public void shoot() {
		int ran = (int) (Math.random()*3) + 1;
		switch(ran){
		case 1:
			System.out.println("Rock");
			break;
		case 2: 
			System.out.println("Paper");
			break;
		case 3:
			System.out.println("Paper");
			break;
		}
		//System.out.println(ran);
		
	}
}
