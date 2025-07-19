public class Potion {
    String name;
    String type;
    int statAdjuster;

    public Potion(String name, String type, int statAdjuster) {
        this.name = name;
        this.type = type;
        this.statAdjuster = statAdjuster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatAdjuster() {
        return statAdjuster;
    }

    public void setStatAdjuster(int statAdjuster) {
        this.statAdjuster = statAdjuster;
    }

    
}
