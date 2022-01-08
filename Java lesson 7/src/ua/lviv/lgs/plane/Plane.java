package ua.lviv.lgs.plane;

public abstract class Plane {
	public Plane(int length, int width, int weight) {
		this.lenght = length;
		this.width = width;
		this.weight = weight;
	}
public void startEngine() {
	double time = (Math.random()*(68+1)+20);
	System.out.println("Time to take off: "+ time + " seconds");
}
public void planeTakeOff() {
	double km = (Math.random()*1000);
	System.out.println("Plane has: "+ km + " kilometres on a full tank of fuel");
	
}

public void planeLanding() {
	System.out.println("Plane is landing!");
}
int width;
int lenght;
int weight;
private ShipControll ShipControll = new ShipControll();
public void moveUp() {
	ShipControll.moveUp();
}

public void moveDown() {
	ShipControll.moveDown();
}

public void moveLeft() {
	ShipControll.moveLeft();
}

public void moveRight() {
	ShipControll.moveRight();
}

}
