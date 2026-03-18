public class Chest extends GameObject implements Pushable, Interactable {
    private boolean locked;
    private boolean opened;
    private String loot;

    public Chest(String name, int x, int y, boolean locked, String loot) {
        super(name, x, y);
        this.locked = locked;
        this.opened = false;
        this.loot = loot;
    }

    public void unlock() {
        locked = false;
        System.out.println("🔓 " + name + " has been unlocked.");
    }

    @Override
    public void push(String direction) {
        if (opened) {
            System.out.println("The open chest slides awkwardly to the " + direction + ".");
        } else {
            System.out.println(name + " is pushed to the " + direction + ".");
        }
        int newX = x, newY = y;
        switch (direction.toLowerCase()) {
            case "north": newY += 1; break;
            case "south": newY -= 1; break;
            case "east":  newX += 1; break;
            case "west":  newX -= 1; break;
        }
        setPosition(newX, newY);
        System.out.println(name + " is now at (" + x + ", " + y + ")");
    }

    @Override
    public void interact(Knight knight) {
        if (opened) {
            System.out.println(name + " is already open and empty.");
            return;
        }
        if (locked) {
            System.out.println("🔒 " + name + " is locked! The knight needs a key.");
            // TODO: check knight's inventory for key
            return;
        }
        opened = true;
        System.out.println("✨ " + knight.getName() + " opens " + name + " and finds: " + loot + "!");
        // TODO: add loot to knight's inventory
    }
}
