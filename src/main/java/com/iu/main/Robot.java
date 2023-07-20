package com.iu.main;

public class Robot {
	private String name;
	
	private Arm arm;

	public Robot() {
		this.arm = new Arm();
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
