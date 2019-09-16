package javaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class DbServices implements FortuneService {

    @Override
    public String getFortune() {
        return "Yah Yah Yah";
    }
}
