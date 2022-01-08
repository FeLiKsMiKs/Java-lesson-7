package ua.lviv.lgs.plane;

public class Cy27 extends  Plane   implements SpecialOpportunities {

	int maxSpeed;
	String color;

	public Cy27(int length, int width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
		
	}

	

	@Override
	public void TurboSpeed() {
int newSpeed = this.maxSpeed + (int)(Math.random() * this.maxSpeed);
System.out.println("Turbospeed is: "+newSpeed+" kilometres");
		
	}

	@Override
	public void StelsTechnology() {
		int randomStels = (int) (Math.random()*1000);
		System.out.println("Invisiblity time: "+randomStels+" seconds");
	}

	@Override
	public void NuclearStrike() {
		int nuclearWarheads = (int) (Math.random()*(10+1));
		System.out.println("Warheads dropped: "+nuclearWarheads);
	}

}
