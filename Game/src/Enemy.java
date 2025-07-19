public class Enemy {
    String name;
    String type;
    int health;
    int attackVal;
    int defenceVal;

    public Enemy(String name, String type, int health, int attackVal, int defenceVal) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attackVal = attackVal;
        this.defenceVal = defenceVal;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackVal() {
        return attackVal;
    }

    public void setAttackVal(int attackVal) {
        this.attackVal = attackVal;
    }

    public int getDefenceVal() {
        return defenceVal;
    }

    public void setDefenceVal(int defenceVal) {
        this.defenceVal = defenceVal;
    }

    
}
