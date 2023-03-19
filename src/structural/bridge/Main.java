package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Track track = new Mers(new Vasya());
        track.rides();
        track = new MAN(new Jonny());
        track.rides();
    }
}
