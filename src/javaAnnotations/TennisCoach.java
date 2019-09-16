package javaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// ID for this component is iAmAnID
// You dont have to declare the bean in the bean of Xml Configuration
@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println(">> TennisCoach: I'm reporting from inside the default Constructor");
    }

    // It can also be implemented upon a private field.
    // Spring will automatically create the construction and also plug it
    // Into the class into the main class.
    // Field Injector
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // No need for the <constructor arg/> in the XML file.
    // It automatically wires the whole system up together
    // Constructor Injector
    /*
        @Autowired
        public TennisCoach(FortuneService fortuneService) {
            this.fortuneService = fortuneService;
        }
    */

    @Override
    public String getDailyWorkOut(){
        return "Code 12 for hours";
    }

    @Override
    public String getFortuneToday(){
        return "You've made us proud! " + this.fortuneService.getFortune();
    }

}
