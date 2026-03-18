public class Game {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("       ⚔️  KNIGHT'S QUEST BEGINS ⚔️   ");
        System.out.println("======================================\n");

        // --- Setup ---
        Knight knight       = new Knight("Sir Roland", 0, 0);
        Goblin goblin1      = new Goblin("Grug", 3, 2);
        Goblin goblin2      = new Goblin("Snark", 5, 1);
        WoodenBox box       = new WoodenBox("Wooden Box", 1, 0);
        Rock rock           = new Rock("Boulder", 2, 2, true);
        Chest lockedChest   = new Chest("Ancient Chest", 4, 4, true, "Golden Sword");
        Chest openChest     = new Chest("Old Chest", 6, 0, false, "Health Potion");

        System.out.println("🧙 Initial State:");
        System.out.println("  " + knight);
        System.out.println("  Goblin 1: " + goblin1);
        System.out.println("  Goblin 2: " + goblin2);
        System.out.println();

        // --- Knight moves ---
        System.out.println("--- Movement ---");
        knight.move(3, 2);
        System.out.println();

        // --- Attack goblins ---
        System.out.println("--- Combat ---");
        knight.attack(goblin1);
        knight.attack(goblin1);
        goblin2.attackKnight(knight);
        knight.attack(goblin2);
        System.out.println();

        // --- Push objects ---
        System.out.println("--- Pushing Objects ---");
        knight.push(box, "east");
        knight.push(rock, "north");
        knight.push(lockedChest, "south");
        System.out.println();

        // --- Attack wooden box ---
        System.out.println("--- Attacking Box ---");
        knight.attack(box);
        knight.attack(box); // try attacking already broken box
        System.out.println();

        // --- Interact with chests ---
        System.out.println("--- Chest Interaction ---");
        knight.interact(lockedChest);   // locked — should fail
        lockedChest.unlock();
        knight.interact(lockedChest);   // now unlocked — should succeed
        knight.interact(openChest);     // open chest — already empty
        System.out.println();

        // --- Equip new sword ---
        System.out.println("--- Loot and Equip ---");
        knight.setSword(new Sword("Golden Sword", 50));
        System.out.println();

        // --- Final state ---
        System.out.println("--- Final State ---");
        System.out.println(knight);
        System.out.println("Goblin 1 alive: " + goblin1.isAlive());
        System.out.println("Goblin 2 alive: " + goblin2.isAlive());
        System.out.println("Box broken: " + box.isBroken());
    }
}
