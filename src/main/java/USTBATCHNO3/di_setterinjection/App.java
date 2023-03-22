package USTBATCHNO3.di_setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    	Roles r =context.getBean("setinj", Roles.class);
    	
    	r.display();
    	
    }
}
