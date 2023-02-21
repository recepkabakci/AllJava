package com.recepkabakci.robotvacuum;

public class VacuumRobotManager {

	public static void main(String[] args) {
		System.out.println("START");
		VacuumRobot robot = new VacuumRobot("Bilge", "Adam");
		robot.start();
		System.out.println("END");
	}

}
