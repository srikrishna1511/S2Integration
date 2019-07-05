package sample.dampletest;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.dampletest.dao.DataBaseDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	 
    	     
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Context created");
        
        DataBaseDAO employeeDAO = (DataBaseDAO) context.getBean("DataBaseDAO");
        employeeDAO.getS2Data();
        
        context.close();
    }
}
