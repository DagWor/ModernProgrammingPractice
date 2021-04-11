package exercise3;

import java.util.*;

public class Tournament {
    private List<Match> matchList;

    public Tournament(List<Match> matchList) {
        this.matchList = matchList;
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }
}
