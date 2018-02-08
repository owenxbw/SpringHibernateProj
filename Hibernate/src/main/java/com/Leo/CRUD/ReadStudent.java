package com.Leo.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Leo.Entity.Student;

public class ReadStudent {

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
			Student std = new Student("Leo II","James","JamesL@gamil.com");
			//start transaction
			session.beginTransaction();
			
			//save the student
			session.save(std);
			session.getTransaction().commit();
			System.out.println("Finished saving");
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			//find out the primary key
			System.out.println("The generated id: "+ std.getId());
			Student newStd = session.get(Student.class, std.getId());
			System.out.println("Retrived student: "+ newStd);
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Finished saving");
		}
		finally {
			factory.close();
		}
	}
}
