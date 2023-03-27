import java.util.ArrayList;

import javax.swing.JToolBar;

public class main {
	//initial Array List for storing orbits(planets) and moons
	public static ArrayList<Planet> orbits = new ArrayList<Planet>(); 
	public static ArrayList<Moon> moons = new ArrayList<Moon>();
	JToolBar toolbar = new JToolBar();
	
	
	public static void main(String[] args) {
		SolarSystem solar = new SolarSystem(1600,1200); //Set black space screen
		// initial sun 
		Stars sun = new Stars(solar, -10 , 0, 100, "YELLOW");
		//initial all planets
		Planet mercury = new Planet(solar,75, 5.8, 10, "LIGHT_GREY" );
		orbits.add(mercury);
		Planet venus = new Planet(solar, 100, 4.5, 20, "WHITE" );
		orbits.add(venus);
		Planet earth = new Planet(solar, 135, 3.9 ,21, "BLUE");
		orbits.add(earth);
		Planet mars = new Planet(solar, 165, 3.4, 14, "RED" );
		orbits.add(mars);
		Planet jupiter = new Planet(solar, 225, 2.3 ,45, "#C19A6B");
		orbits.add(jupiter);
		Planet saturn = new Planet(solar, 295, 1.9, 37, "#DAA06D");
		orbits.add(saturn);
		Planet uranus = new Planet(solar, 335, 1.6, 30, "#0047AB");
		orbits.add(uranus);
		Planet neptune = new Planet(solar, 385, 1.5, 31 ,"BLUE");
		orbits.add(neptune);
		
		//initial all moons
		Moon moon = new Moon(solar, earth.getdistance(), earth.getvelocity(), earth.getdiameter()/4, "GREY", 17, 7.0);
		moons.add(moon);
		Moon mars_moons = new Moon(solar, mars.getdistance(), mars.getvelocity(), mars.getdiameter()/3, "GREY", 15, 5);
		moons.add(mars_moons);
		Moon mars_moons2 = new Moon(solar, mars.getdistance(), mars.getvelocity(), mars.getdiameter()/3, "GREEN", 22, 7);
		moons.add(mars_moons2);
		Moon jup_moon = new Moon(solar, jupiter.getdistance(), jupiter.getvelocity(), jupiter.getdiameter()/4, "WHITE", 33, 5);
		moons.add(jup_moon);
		Moon sat_moon = new Moon(solar, saturn.getdistance(), saturn.getvelocity(), saturn.getdiameter()/4, "GREY", 27, 6);
		moons.add(sat_moon);
		Moon ura_moon = new Moon(solar, uranus.getdistance(), uranus.getvelocity(), uranus.getdiameter()/4, "WHITE", 25, 7);
		moons.add(ura_moon);
		Moon nep_moon = new Moon(solar, neptune.getdistance(), neptune.getvelocity(), neptune.getdiameter()/4, "GREY", 24, 6);
		moons.add(nep_moon);
		
		for (int i = 0; i < 1440; i++) { 
			for(int x = 0; x < orbits.size(); x++) {
				orbits.get(x).move(i);
			}
			for (int j = 0; j < moons.size(); j++) {
				moons.get(j).move(i);
			}
			sun.movesun();
			solar.finishedDrawing();	
		}
	}
}
