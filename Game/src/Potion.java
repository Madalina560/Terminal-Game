public class Potion extends Item{
    int healthModifier;

    public Potion(String name, String type, String description, int healthModifier) {
        super(name, type, description);
        this.healthModifier = healthModifier;
    }

    public int getHealthModifier() {
        return healthModifier;
    }

    public void setHealthModifier(int healthModifier) {
        this.healthModifier = healthModifier;
    }
}
