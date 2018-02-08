package com.Leo.CRUD;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Leo.Entity.Student;

public class CreateStudent {

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
			Student std1 = new Student("Tom","James","JamesT@gamil.com");
			Student std2 = new Student("Tony","Jam","JamT@gamil.com");
			Student std3 = new Student("Mary","Helen","HelenM@gamil.com");
			//start transaction
			session.beginTransaction();
			
			//save the student
			session.save(std);
			session.save(std1);
			session.save(std2);
			session.save(std3);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Finished saving");
		}
		finally {
			factory.close();
		}
	}

}
