package com.kgisl.springmvcjpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
    public static void main(String[] args) {
        System.out.println("*****Hibernate MANY TO ONE*****");

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernateconfig.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory sf = meta.getSessionFactoryBuilder().build();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        Author a1 = new Author();
        a1.setAuthorName("J.K Rowling");
        a1.setAuthorEmail("jkrowling@gmail.com");

        Author a2 = new Author();

        a2.setAuthorName("Jane Austen");
        a2.setAuthorEmail("janeausten@yahoo.com");

        Book e1 = new Book();
        e1.setName("Harry Potter & the Philosopher's Stone");
        Book e2 = new Book();
        e2.setName("Harry Potter & the Chamber of Secrets");

        Book e3 = new Book();
        e3.setName("Emma");
        Book e4 = new Book();
        e4.setName("Persuasion");

        e1.setAuthor(a1);
        e2.setAuthor(a1);

        a2.setBooks(e3);
        a2.setBooks(e4);

        // transaction=session.beginTransaction();
        // session.remove(a1);
        // transaction.commit();

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        session.persist(e4);

        transaction.commit();

        // remove e1
        // transaction=session.beginTransaction();
        // session.remove(e1);
        // transaction.commit();

        // transaction.commit();

        session.close();

        System.out.println("Successfully executed from One Address to One Employee");

    }
}
