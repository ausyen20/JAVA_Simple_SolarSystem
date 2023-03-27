
public class Moon extends Planet{
	private double centreOfRotationDistance;
	private double centreOfRotationAngle;
	
	public Moon(SolarSystem solar, double distance, double velocity, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle) {
		super(solar, distance, velocity, diameter, col);
		this.centreOfRotationDistance = centreOfRotationDistance;
		this.centreOfRotationAngle = centreOfRotationAngle;
	}
	
	public void move(double angle) {
		getsolarsystem().drawSolarObjectAbout(getdistance(), angle * getvelocity(), getdiameter(), getcolor(), centreOfRotationDistance, angle* centreOfRotationAngle);
	}
	
}
