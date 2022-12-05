package creational.prototype;

public class Triangle implements Cloneable{
    final int sideA;
    final int sideB;
    final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(Triangle triangle) {
        sideA = triangle.sideA;
        sideB = triangle.sideB;
        sideC = triangle.sideC;
    }

    @Override
    protected Object clone() {
        return new Triangle(this);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
