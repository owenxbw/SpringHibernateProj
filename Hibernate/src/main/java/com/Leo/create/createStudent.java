package com.Leo.create;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Leo.entity.Student;

public class createStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			// create student object
			Student std = new Student("Leo","James","JamesL@gamil.com");
			
			//start transaction
			session.beginTransaction();
			
			//save the student
			session.save(std);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Finished saving");
		}
		finally {
			factory.close();
		}
	}

}
