public class Sword {
    private String name;
    private int damage;

    public Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() { return damage; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name + " (damage: " + damage + ")";
    }
}
