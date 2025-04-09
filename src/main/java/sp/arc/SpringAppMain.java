package sp.arc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringAppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Writer w = context.getBean(Writer.class); // Instead of writer1
        w.create();
    }
}
