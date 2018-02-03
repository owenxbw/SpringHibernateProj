package net.antra.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.antra.springdemo.dao.DemoDAO;

@Service("aService")
public class DemoServiceImpl implements DemoService{
	@Autowired
	DemoDAO aDAO; //DAO contained in aService ??

	public DemoDAO getaDAO() {
		return aDAO;
	}

	public void setaDAO(DemoDAO aDAO) {
		this.aDAO = aDAO;
	}

	@Override
	public void doSomeThing() {
		aDAO.doSomething();
	}
	
}
