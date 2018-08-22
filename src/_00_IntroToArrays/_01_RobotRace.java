package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method

	// 2. create an array of 5 robots.
	public static void main(String[] args) {
		Robot[] r = new Robot[5];

		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot();
			r[i].setY(550);
			r[i].setX((200 * i) + 50);
		}

		boolean done = false;
		while (done == false) {
			for (int i = 0; i < r.length; i++) {
				Random r2 = new Random();

				int x = r2.nextInt(50);

				r[i].setSpeed(10);
				r[i].move(x);
				if (r[i].getY() < 0) {
					done = true;
					System.out.print("Robot " + (i + 1) + " is the winner. Party.");
					break;
				}

			}
		}

	}

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// CHALLENGE: make the robots race around a circular track.

}
