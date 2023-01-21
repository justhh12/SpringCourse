package org.example;

import org.example.module.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            //Person person = session.get(Person.class, 2);
            //update
            //person.setName("New name");
            //delete
            //session.delete(person);

            Person person1 = new Person("New preson", 11);
            session.save(person1);

            session.getTransaction().commit();

            System.out.println(person1.getId());

        } finally {
            sessionFactory.close();
        }
    }
}
