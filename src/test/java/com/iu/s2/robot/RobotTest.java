package com.iu.s2.robot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class RobotTest {

	@Autowired
	private Robot robot;
//	private Arm_Left arm_Left;
	
	@Test
	public void test() {
		
		
		assertNotNull(robot.getArm_Right());   //암레프트가 널이 아니면 true!
		
		
		
//		Arm_Left arm_Left = new Arm_Left();
//		arm_Left.setName("Left Arm");
	
		
		
		
		
		//assertNotNull(robot.getArm_Left()); -> false
		//왜 false 인가..
		//Robot 클래스에 @autowired를  하면 객체가 있는거지만
		//그냥 private Arm_Left arm_Left 선언만되있으면 null이 들어가 있다. 
	}
}
