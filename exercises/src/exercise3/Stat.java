package exercise3;

public class Stat {
    private StatType type;
    private String description;

    public Stat(StatType type, String description) {
        this.type = type;
        this.description = description;
    }

    public StatType getType() {
        return type;
    }

    public void setType(StatType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
