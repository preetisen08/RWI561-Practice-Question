       package Com.Hibernate;

        import org.hibernate.Session;
    	import org.hibernate.SessionFactory;
    	import org.hibernate.Transaction;
    	import org.hibernate.cfg.Configuration;


    	public class App {
    	    public static void main(String[] args) {
    	        Configuration cfg = new Configuration();
    	        cfg.configure("hibernate.cfg.xml");
    	        
    	        SessionFactory factory = cfg.buildSessionFactory();
    	        
    	        Session session = factory.openSession();
    	        Transaction tx = session.beginTransaction();
    	        
    	        
    	        Emp emp1=new Emp();
    	        emp1.setSalary(20000);
    	        emp1.setName("Preeti");

    	        session.save(emp1);
    	        
    	        Bank bank1=new Bank();
    	        bank1.setId(123);
    	        bank1.setName("BOI");
    	        
    	        session.save(bank1);
    	        
    	        
    	        Emp emp2=new Emp();
    	        emp2.setSalary(10000);
    	        emp2.setName("Kreeti");

    	        session.save(emp2);
    	        
    	        
    	        Bank bank2=new Bank();
    	        bank2.setId(321);
    	        bank2.setName("BOI");
    	        
    	        session.save(bank2);
    	        
    	        
    	     
    	        tx.commit();
    	        session.close();
    	        factory.close();
    	    }
    	}
   