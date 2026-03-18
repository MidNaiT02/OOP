public class Goblin extends LivingEntity implements Attackable {
    private int attackDamage;

    public Goblin(String name, int x, int y) {
        super(name, x, y, 40);
        this.attackDamage = 10;
    }

    @Override
    public void takeAttack(int damage) {
        takeDamage(damage);
    }

    public void attackKnight(Knight knight) {
        System.out.println(name + " attacks " + knight.getName() + " for " + attackDamage + " damage!");
        knight.takeDamage(attackDamage);
    }

    @Override
    protected void die() {
        alive = false;
        System.out.println("💀 " + name + " has been defeated! *goblin screech*");
        // TODO: drop loot, play death animation
    }
}
