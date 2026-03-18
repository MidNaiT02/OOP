public abstract class LivingEntity extends GameObject {
    protected int health;
    protected int maxHealth;
    protected boolean alive;

    public LivingEntity(String name, int x, int y, int health) {
        super(name, x, y);
        this.health = health;
        this.maxHealth = health;
        this.alive = true;
    }

    public int getHealth() { return health; }
    public boolean isAlive() { return alive; }

    public void takeDamage(int damage) {
        if (!alive) return;
        health = Math.max(0, health - damage);
        System.out.println(name + " takes " + damage + " damage! HP: " + health + "/" + maxHealth);
        if (health == 0) die();
    }

    protected abstract void die();
}
