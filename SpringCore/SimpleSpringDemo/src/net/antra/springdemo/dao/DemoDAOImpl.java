package net.antra.springdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DemoDAOImpl implements DemoDAO {
	
	private String message = "123";
	
	public void doSomething(){
		System.out.println(message);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void saveDemo() {
		System.out.println("In save DEMO");
	}
}