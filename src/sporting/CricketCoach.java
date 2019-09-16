package sporting;

public class CricketCoach implements MainCoach {
    private String email;
    private String team;
    private String bestAthlete;


    @Override
    public String getDailyWorkOut() {
        return "I'm always in the field for 12hours";
    }

    @Override
    public String getFortune() {
        return "You are making great heights daily!";
    }

    public void setEmail(String email) {
        System.out.println(email);
        this.email = email;
    }

    public void setTeam(String team) {
        System.out.println(team);
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
