package Problem4;  

public class CircuitTest {

    public static void main(String[] args) {

        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        circuit.applyPotentialDiff(12);

        System.out.println("Equivalent Resistance: " + circuit.getResistance());
        System.out.println("Total Current: " + circuit.getCurrent());
        System.out.println("Total Power: " + circuit.getPower());

        System.out.println("\nVoltage distribution:");

        System.out.println("Resistor a voltage: " + a.getPotentialDiff());
        System.out.println("Resistor b voltage: " + b.getPotentialDiff());
        System.out.println("Resistor c voltage: " + c.getPotentialDiff());
        System.out.println("Resistor d voltage: " + d.getPotentialDiff());
        System.out.println("Resistor e voltage: " + e.getPotentialDiff());
    }
}