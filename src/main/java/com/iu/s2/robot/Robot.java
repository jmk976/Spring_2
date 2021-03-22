package com.iu.s2.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	@Autowired
	@Qualifier("al")   //이 이름으로 된 걸 집어넣으세요
	private Arm arm_Left;
	@Autowired
	@Qualifier("ar")
	private Arm arm_Right;
	public Arm getArm_Left() {
		return arm_Left;
	}
	public void setArm_Left(Arm arm_Left) {
		this.arm_Left = arm_Left;
	}
	public Arm getArm_Right() {
		return arm_Right;
	}
	public void setArm_Right(Arm arm_Right) {
		this.arm_Right = arm_Right;
	}
	
	
	

}
