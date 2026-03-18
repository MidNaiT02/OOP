public class Knight extends LivingEntity {
    private Sword sword;

    public Knight(String name, int x, int y) {
        super(name, x, y, 100);
        this.sword = new Sword("Iron Sword", 25);
    }

    public void setSword(Sword sword) {
        this.sword = sword;
        System.out.println(name + " equips " + sword.getName() + "!");
    }

    public void move(int newX, int newY) {
        System.out.println(name + " moves from (" + x + ", " + y + ") to (" + newX + ", " + newY + ")");
        setPosition(newX, newY);
    }

    public void attack(Attackable target) {
        System.out.println(name + " attacks " + ((GameObject) target).getName() + " with " + sword.getName() + "!");
        target.takeAttack(sword.getDamage());
    }

    public void push(Pushable target) {
        System.out.println(name + " pushes " + ((GameObject) target).getName() + "!");
        target.push("north");
    }

    public void push(Pushable target, String direction) {
        System.out.println(name + " pushes " + ((GameObject) target).getName() + " to the " + direction + "!");
        target.push(direction);
    }

    public void interact(Interactable target) {
        System.out.println(name + " interacts with " + ((GameObject) target).getName() + "!");
        target.interact(this);
    }

    @Override
    protected void die() {
        alive = false;
        System.out.println("💀 " + name + " has fallen! Game Over.");
        // TODO: trigger game over screen
    }

    @Override
    public String toString() {
        return name + " | HP: " + health + "/" + maxHealth
                + " | Sword: " + sword.getName()
                + " | Pos: (" + x + ", " + y + ")";
    }
}
