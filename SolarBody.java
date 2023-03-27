
public class SolarBody {
	private SolarSystem solar;
	private double distance;
	private double velocity;
	private double diameter;
	private String color;
	private double centreOfRotationDistance;
	private double centreOfRotationAngle;
	
	public SolarBody (SolarSystem solar, double distance, double velocity, double diameter, String col) {
		this.solar = solar;
		this.distance = distance;
		this.velocity = velocity;
		this.diameter = diameter;
		this.color = col;
		
	}
	public SolarBody(SolarSystem solar, double distance, double velocity, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle) {
		this.solar = solar;
		this.velocity = velocity;
		this.diameter = diameter;
		this.color = col;
		this.centreOfRotationDistance = centreOfRotationDistance;
		this.centreOfRotationAngle = centreOfRotationAngle;
	}
	
	public SolarSystem getsolarsystem() {
		return solar;
	}
	
	public double getdistance() {
		return distance;
	}
	
	public double getvelocity() {
		return velocity;
	}
	
	public double getdiameter() {
		return diameter;
	}
	
	public String getcolor() {
		return color;
	}
	
	public double getrd() {
		return centreOfRotationDistance;
	}
	
	public double getra() {
		return centreOfRotationAngle;
	}
	
	public void setdistance(double newdistance) {
		newdistance = distance;
	}
	
	public void setvelocity(double newvelocity) {
		newvelocity = velocity;
	}
	
	public void setdiameter(double newdiameter) {
		newdiameter = diameter;
	}
	
	public void move(double angle) {
		getsolarsystem().drawSolarObject(distance, angle*velocity, diameter , color);
	}
	public void movesun() {
		getsolarsystem().drawSolarObject(distance, velocity, diameter , color);
	}
	
	public void mmove(double angle) {
		getsolarsystem().drawSolarObjectAbout(distance, angle*velocity, diameter, color, centreOfRotationDistance, angle*centreOfRotationAngle);
	}
	
}
