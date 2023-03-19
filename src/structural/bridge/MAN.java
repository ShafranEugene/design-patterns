package structural.bridge;

public class MAN implements Track{

    private final Driver driver;

    public MAN(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void rides() {
        System.out.println("A MAN is driving," + driver.getName() + " is driving.");
    }
}
