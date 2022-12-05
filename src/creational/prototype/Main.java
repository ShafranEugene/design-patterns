package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3,5,4);
        System.out.println(triangle1);

        Triangle triangle2 = (Triangle) triangle1.clone();
        System.out.println(triangle2);

        Triangle triangle3 = new Triangle(triangle1);
        System.out.println(triangle3);
    }
}
