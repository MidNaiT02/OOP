public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this(0.0, 'C');
    }

    public Temperature(double value) {
        this(value, 'C');
    }

    public Temperature(char scale) {
        this(0.0, scale);
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = Character.toUpperCase(scale);
    }

    public double getValue() {
        return value;
    }

    public char getScale() {
        return scale;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = Character.toUpperCase(scale);
    }

    public void set(double value, char scale) {
        this.value = value;
        this.scale = Character.toUpperCase(scale);
    }

    public double getCelsius() {
        if (scale == 'C') return value;
        return 5.0 * (value - 32) / 9.0;
    }

    public double getFahrenheit() {
        if (scale == 'F') return value;
        return 9.0 * value / 5.0 + 32;
    }

public static void main(String[] args) {
        System.out.println("=== Temperature Class Demo ===");

        // Default constructor
        Temperature t1 = new Temperature();
        System.out.println("Default (0 C): " + t1.getCelsius() + "°C / " + t1.getFahrenheit() + "°F");

        // Value only (Celsius)
        Temperature t2 = new Temperature(100.0);
        System.out.println("100°C: " + t2.getCelsius() + "°C / " + t2.getFahrenheit() + "°F");

        // Scale only
        Temperature t3 = new Temperature('F');
        System.out.println("0°F: " + t3.getCelsius() + "°C / " + t3.getFahrenheit() + "°F");

        // Both parameters
        Temperature t4 = new Temperature(32.0, 'F');
        System.out.println("32°F: " + t4.getCelsius() + "°C / " + t4.getFahrenheit() + "°F");

        // Using setters
        t4.set(0.0, 'C');
        System.out.println("After set to 0°C: " + t4.getCelsius() + "°C");

        t4.setValue(212.0);
        t4.setScale('F');
        System.out.println("After set to 212°F: " + t4.getFahrenheit() + "°F / " + t4.getCelsius() + "°C");

        System.out.println("Scale: " + t4.getScale());
    }
    
}