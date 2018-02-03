package net.antra.springdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.antra.springdemo.dao.DemoDAO;
import net.antra.springdemo.service.DemoService;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/application-context.xml");
		DemoDAO aDAO = (DemoDAO)ac.getBean("demoDAOImpl");
		aDAO.saveDemo();
		aDAO.doSomething();;
//		DemoService aService = (DemoService)ac.getBean("aService");
//		aService.doSomeThing();
	}

}
