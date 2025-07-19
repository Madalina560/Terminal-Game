public class Character {
    String name;
    String charClass;
    String specialAtk;
    int health;
    int punchVal;
    int kickVal;
    int defenceVal;
    int specialAtkVal;

    public Character(String name, String charClass, String specialAtk, int health, int punchVal, int kickVal, int defenseVal,
        int specialAtkVal) {
            this.name = name;
            this.charClass = charClass;
            this.specialAtk = specialAtk;
            this.health = health;
            this.punchVal = punchVal;
            this.kickVal = kickVal;
            this.defenceVal = defenseVal;
            this.specialAtkVal = specialAtkVal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public String getSpecialAtk() {
        return specialAtk;
    }

    public void setSpecialAtk(String specialAtk) {
        this.specialAtk = specialAtk;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPunchVal() {
        return punchVal;
    }

    public void setPunchVal(int punchVal) {
        this.punchVal = punchVal;
    }

    public int getKickVal() {
        return kickVal;
    }

    public void setKickVal(int kickVal) {
        this.kickVal = kickVal;
    }

    public int getDefenceVal() {
        return defenceVal;
    }

    public void setDefenceVal(int defenceVal) {
        this.defenceVal = defenceVal;
    }

    public int getSpecialAtkVal() {
        return specialAtkVal;
    }

    public void setSpecialAtkVal(int specialAtkVal) {
        this.specialAtkVal = specialAtkVal;
    }
}
