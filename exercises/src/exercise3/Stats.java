package exercise3;

import java.util.*;
public class Stats {
    private List<Stat> statList;
    private Match match;


    public Stats(List<Stat> statList, Match match) {
        this.statList = statList;
        this.match = match;
    }

    public List<Stat> getStatList() {
        return statList;
    }

    public void setStatList(List<Stat> statList) {
        this.statList = statList;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
