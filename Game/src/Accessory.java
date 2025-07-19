public class Accessory extends Item{
    int specialModifier;

    public Accessory(String name, String type, String description, int specialModifier) {
        super(name, type, description);
        this.specialModifier = specialModifier;
    }

    public int getSpecialModifier() {
        return specialModifier;
    }

    public void setSpecialModifier(int specialModifier) {
        this.specialModifier = specialModifier;
    }

}
