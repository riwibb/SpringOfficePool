package org.sallu.springdemo.officepool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayRun {
	public static void main(String[] args) {
		ApplicationContext oContext = new ClassPathXmlApplicationContext("spring.xml");
		GameRound oThisRound = (GameRound) oContext.getBean("bean-RoundOne");
		oThisRound.setUpRound();
		System.out.println(oThisRound.toString());
	}

}
