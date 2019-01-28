public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateSurface() {
        return Math.PI * radius;
    }
}
