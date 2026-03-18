public class Rock extends GameObject implements Pushable {
    private boolean heavy;

    public Rock(String name, int x, int y, boolean heavy) {
        super(name, x, y);
        this.heavy = heavy;
    }

    @Override
    public void push(String direction) {
        if (heavy) {
            System.out.println(name + " is too heavy to push far — it barely budges.");
        }
        int newX = x, newY = y;
        int step = heavy ? 1 : 2;
        switch (direction.toLowerCase()) {
            case "north": newY += step; break;
            case "south": newY -= step; break;
            case "east":  newX += step; break;
            case "west":  newX -= step; break;
        }
        setPosition(newX, newY);
        System.out.println(name + " rolls to (" + x + ", " + y + ")");
    }
}
