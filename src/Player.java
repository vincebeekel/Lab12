
public abstract class Player {
	
	private String name;
	private int rock = 1;
	private int scissors = 3;
	private int paper = 2;
	private int ranNum = 0;
	
	
	public abstract void getName();
	
	public abstract void shoot();
	
	public void run() {
		getName();
		shoot();
		
		
		
	}

}
