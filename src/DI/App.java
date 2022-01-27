package DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Customer.xml");
        Customer c1 = context.getBean("c1",Customer.class);
        System.out.println(c1);

        ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
        cxt.close();
    }
}
