package exercise3;

public class Match {
    private Team home;
    private Team away;
    private Team winner;
    private Stats stats;

    public Match(Team home, Team away, Team winner) {
        this.home = home;
        this.away = away;
        this.winner = winner;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
