package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world
 *
 */
public class App 
{
	public static void main( String[] args )
    {
		    ApplicationContext context = new ClassPathXmlApplicationContext("SPconfig.xml");
	        Employee emp1 = (Employee) context.getBean("emp");
	        System.out.println(emp1);
	    }
	}

