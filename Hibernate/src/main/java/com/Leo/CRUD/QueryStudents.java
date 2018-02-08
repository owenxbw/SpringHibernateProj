package com.Leo.CRUD;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Leo.Entity.Student;

public class QueryStudents {

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
			
			List<Student> AllStudents = session.createQuery("from Student").list();

			displayStudents(AllStudents);
			
			AllStudents = session.createQuery("from Student where lastName = 'James' OR firstName = 'Leo'").list();
			displayStudents(AllStudents);
			
			session.getTransaction().commit();
			System.out.println("Finished saving");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> AllStudents) {
		for(Student x:AllStudents) {
			System.out.println(x);
		}
	}
}
