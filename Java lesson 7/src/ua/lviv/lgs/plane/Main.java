package ua.lviv.lgs.plane;

public class Main {

	public static void main(String[] args) {
		Cy27  plane = new Cy27(150, 50, 250, 444, "Grey");
		
		plane.startEngine();
		plane.planeTakeOff();
		plane.moveUp();
		plane.moveDown();
		plane.moveLeft();
		plane.moveRight();
		plane.StelsTechnology();
		plane.NuclearStrike();
		plane.TurboSpeed();
		plane.planeLanding();
	}

}
