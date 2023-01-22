package org.example;

import org.example.module.Item;
import org.example.module.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class)
                .addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//             ------ 1 ---------
//            Person person = session.get(Person.class,3);
//            System.out.println(person);
//
//            List<Item> items = person.getItems();
//            System.out.println(items);

//             ------ 2 ---------
//            Item item = session.get(Item.class,5);
//            System.out.println(item);
//
//            Person person = item.getOwner();
//            System.out.println(person);

//             ------ 3 ---------
//            Person person = session.get(Person.class,2);
//            Item newItem = new Item("Item from Hibernate", person);
//
//            person.getItems().add(newItem);
//
//            session.save(newItem);

//            ------ 4 ---------
//            Person person = new Person("Test Person", 45);
//            Item newItem = new Item("Item from Hibernate 2", person);
//
//            person.setItems(new ArrayList<Item>(Collections.singletonList(newItem)));
//
//            session.save(person);
//            session.save(newItem);

//            ------ 5 ---------
//            Person person = session.get(Person.class,3);
//            List<Item> items = person.getItems();
//
//            // SQL
//            for (Item item: items)
//                session.remove(item);
//
//            // Не порождает SQL, но необходимо для того, чтобы в кэше все было верно
//            person.getItems().clear();

//            ------ 6 ---------
//            Person person =session.get(Person.class,2);
//            session.remove(person);
//
//            person.getItems().forEach(i -> i.setOwner(null));

            Person person = session.get(Person.class,4);
            Item item = session.get(Item.class,1);

            item.getOwner().getItems().remove(item);

            item.setOwner(person);
            person.getItems().add(item);


            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
