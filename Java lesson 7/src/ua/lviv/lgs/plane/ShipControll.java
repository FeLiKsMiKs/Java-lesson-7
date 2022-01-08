package ua.lviv.lgs.plane;

public class ShipControll {
	public void moveUp() {
		System.out.println("Plane goes up on: " + PlaneMove. move() + " kilometres");
	}

	public void moveDown() {
		System.out.println("Plane goes down on: " + PlaneMove.move() + " kilometres");
	}

	public void moveLeft() {
		System.out.println("Plane goes left on: " + PlaneMove.move() + " kilometres");
	}

	public void moveRight() {
		System.out.println("Plane goes right on: " + PlaneMove.move() + " kilometres");
	}
}
