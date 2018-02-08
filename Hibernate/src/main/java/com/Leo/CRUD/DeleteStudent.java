package com.Leo.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Leo.Entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 2;
			
			//start transaction
			session.beginTransaction();
			
			Student std = session.get(Student.class, studentId);
			session.delete(std);
			
			System.out.println("Deleting student with student Id: "+ std.getId());
			session.delete(std);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Finished deleting");
		}
		finally {
			factory.close();
		}
	}

}
