public class WoodenBox extends GameObject implements Attackable, Pushable {
    private boolean broken;

    public WoodenBox(String name, int x, int y) {
        super(name, x, y);
        this.broken = false;
    }

    public boolean isBroken() { return broken; }

    @Override
    public void takeAttack(int damage) {
        if (broken) {
            System.out.println(name + " is already broken!");
            return;
        }
        System.out.println(name + " is struck and shatters into pieces! 💥");
        destroy();
    }

    @Override
    public void push(String direction) {
        if (broken) {
            System.out.println("Can't push a broken box!");
            return;
        }
        int newX = x, newY = y;
        switch (direction.toLowerCase()) {
            case "north": newY += 1; break;
            case "south": newY -= 1; break;
            case "east":  newX += 1; break;
            case "west":  newX -= 1; break;
        }
        setPosition(newX, newY);
        System.out.println(name + " slides to (" + x + ", " + y + ")");
    }

    private void destroy() {
        broken = true;
        // TODO: spawn wood fragments, play break sound
    }
}
