package org.example;

import org.example.module.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            List<Person> people =  session.createQuery("update Person set name='Tost' where age < 30").getResultList();
//
//            for (Person person : people
//                 ) {
//                System.out.println(person);
//
//            }

//            session.createQuery("update Person set name='Tost' where age < 30").executeUpdate();
            session.createQuery("delete Person where age < 30").executeUpdate();

            session.getTransaction().commit();


        } finally {
            sessionFactory.close();
        }
    }
}
