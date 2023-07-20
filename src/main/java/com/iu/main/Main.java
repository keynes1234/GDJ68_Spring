package com.iu.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dependency injecttion(의존성 주입)
		//1. method
		//2. 생성자
		
		Robot robot = new Robot();
		
		Arm arm = new Arm();
		
		robot.setArm(arm);
		
		robot=null;
		
		
		System.out.println(robot.getArm());
	}

}
