package sporting;

public class TrackCoach implements MainCoach {
    private FortuneService fortuneService;
    private String email;
    private String team;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "I'm  a Track Coach!";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortune();
    }

}
