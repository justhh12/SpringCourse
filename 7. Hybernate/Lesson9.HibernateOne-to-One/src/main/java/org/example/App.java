package org.example;

import org.example.module.Passport;
import org.example.module.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
//            ---------- 1 ---------------
//            Person person = new Person("Test person", 33);
//            Passport passport = new Passport(12345);
//
//            person.setPassport(passport);
//
//            session.save(person);

//            ---------- 2 ---------------
//            Person person = session.get(Person.class,4);
//            System.out.println(person.getPassport().getPassportNumber());

//            ---------- 3 ---------------
//            Passport passport = session.get(Passport.class,4);
//            System.out.println(passport.getPerson().getName());

//            ---------- 4 ---------------
//            Person person = session.get(Person.class,4);
//            person.getPassport().setPassportNumber(77777);

            Person person = session.get(Person.class,4);
            session.remove(person);

            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
