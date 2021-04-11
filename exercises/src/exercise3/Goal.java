package exercise3;

import java.util.Date;

public class Goal {
    private Date scoredAt;
    private Player scoredBy;

    public Goal(Date scoredAt, Player scoredBy) {
        this.scoredAt = new Date();
        this.scoredBy = scoredBy;
    }

    public Date getScoredAt() {
        return scoredAt;
    }

    public void setScoredAt(Date scoredAt) {
        this.scoredAt = scoredAt;
    }

    public Player getScoredBy() {
        return scoredBy;
    }

    public void setScoredBy(Player scoredBy) {
        this.scoredBy = scoredBy;
    }
}
