package com.iu.s2.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;


public class Robot {
	
    private int age;
    private String name;
	private int price;
	
	
	public Robot() {
		
	}
	
	public Robot(int age, String name, int price) { //기본, 디폴트 생성- 매개 변수 없으면!
		this.age = age;
		this.name = name;
		this.price = price;
		
	}
	
	
	private Arm_Left arm_Left;
	
	private Arm_Right arm_Right;

	public Arm_Left getArm_Left() {
		return arm_Left;
	}

	public void setArm_Left(Arm_Left arm_Left) {
		this.arm_Left = arm_Left;
	}

	public Arm_Right getArm_Right() {
		return arm_Right;
	}

	public void setArm_Right(Arm_Right arm_Right) {
		this.arm_Right = arm_Right;
	}
	
	
	

}
