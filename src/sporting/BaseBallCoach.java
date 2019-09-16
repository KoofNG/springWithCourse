package sporting;

public class BaseBallCoach implements MainCoach {

    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend More time Basing my ball";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortune();
    }
}
