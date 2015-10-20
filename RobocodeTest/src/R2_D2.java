
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html

/**
 * Junior1 - a robot by (your name here)
 */
public class R2_D2 extends JuniorRobot
{
	//control flags
	boolean hit= false;
	
	/**
	 * run: Junior1's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(white, blue, white, yellow, white);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(200);
			turnGunLeft(180);
			turnRight(45);
			ahead(200);
			turnGunLeft(180);
			turnRight(35);
			back(220);
			turnGunRight(180);
			turnLeft(20);
			turnGunRight(180);
		}
	}
	
	@Override
	public void onHitRobot() {
		// TODO Auto-generated method stub
		super.onHitRobot();
		hit= true;
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		if(scannedDistance < 250){
			while(energy > 75){
				fire(2);
				if(!hit){
					break;
				}
			}
		}
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		back(125);
		turnBackRight(3,35);
		ahead(20);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		turnBackLeft(20,90);
	}	
}
