package sporting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntrance {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SportBeans.xml");
        MainCoach theCoach = context.getBean("cricketCoach", MainCoach.class);

        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getFortune());

        context.close();
    }
}
