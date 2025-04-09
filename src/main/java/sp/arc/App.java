package sp.arc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // this will create the object and the constructor call it automatically 
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// this will create the object for the beans declared
        Alien alien = context.getBean( "alien1",Alien.class);
        alien.compile();


    }
}
