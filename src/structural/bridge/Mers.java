package structural.bridge;

public class Mers implements Track{

    private final Driver driver;

    public Mers(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void rides() {
        System.out.println("A Mercedes is driving," + driver.getName() + " is driving.");
    }
}
