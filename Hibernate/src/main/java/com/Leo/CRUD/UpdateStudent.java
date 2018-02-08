package com.Leo.CRUD;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Leo.Entity.Student;

public class UpdateStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {

			//start transaction
			session.beginTransaction();
			
			int studentId = 2;
			Student std = session.get(Student.class, studentId);
			
			std.setFirstName("Peter");
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Finished saving");
		}
		finally {
			factory.close();
		}
	}
}
