public class Square extends Shape {

    private int heigth;
    private int width;

    public Square(final int heigth, final int width) {
        this.heigth = heigth;
        this.width = width;
    }

    public double calculateSurface() {
        return width * heigth;
    }
}
