package javaAnnotations;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    // private ArrayList<String> newTexts = new ArrayList<String>();

    private String [] randomFortunes = {
            "Who runs the World? -> Girls",
            "Where are you headed? -> Moon",
            "What do you want to become? -> Master of my Craft"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(randomFortunes.length);
        String theFortune = randomFortunes[index];
        return theFortune + "!";
    }
}
