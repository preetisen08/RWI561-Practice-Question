package Com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        
	        
	        Student s1=new Student();
	        s1.setId(123);
	        s1.setName("Preeti");

	        session.save(s1);
	        
	        Address a1=new Address();
	        a1.setName("Mandleshwar");
	        
	        session.save(a1);
	        
	        
	     
	        tx.commit();
	        session.close();
	        factory.close();
	    }

    }
