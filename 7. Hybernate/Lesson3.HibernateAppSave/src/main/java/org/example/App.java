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

            Person person1 = new Person("Test1", 33);
            Person person2 = new Person("Test2", 44);
            Person person3 = new Person("Test3", 55);

            session.save(person1);
            session.save(person2);
            session.save(person3);

            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
