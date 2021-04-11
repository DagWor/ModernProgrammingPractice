package exercise3;

import java.util.*;
public class Match {
    private List<Team> teams;
    private Team winner;
    private Stats stats;

    public Match(List<Team> teams, Team winner, Stats stats) {
        this.teams = teams;
        this.winner = winner;
        this.stats = stats;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
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
