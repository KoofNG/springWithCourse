package javaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainApp {
    public static void main(String[] args) {

        // Read the Spring Config FIle
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotationFiles.xml");

        // Get the Bean
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getFortuneToday());

        // Close the context
        context.close();
    }
}
