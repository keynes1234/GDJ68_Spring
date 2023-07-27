package com.iu.main;

public class Robot {
	private String name;
	
	private static Robot robot;
	
	private Arm arm;
	//SingleTone
	
	public Robot() {
		//this.arm = new Arm();
	}
	
	public static Robot getInstanceSingle() {
		if(robot==null) {
			Robot.robot=new Robot();
		}
		return Robot.robot;
	}
	
	public static Robot getInstance() {
		return new Robot();
	}
	
	
	public Arm getArm() {
		return arm;
	}

	public void setArm(Arm arm) {
		this.arm = arm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
