public class Armor extends Item{
    int defenceModifier;

    public Armor(String name, String type, String description, int defenceModifier) {
        super(name, type, description);
        this.defenceModifier = defenceModifier;
    }

    public int getDefenceModifier() {
        return defenceModifier;
    }

    public void setDefenceModifier(int defenceModifier) {
        this.defenceModifier = defenceModifier;
    }
}
