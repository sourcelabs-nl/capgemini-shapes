public class Main {

    public static void main(String[] args) {

        Square square = new Square(10, 11);
        Circle circle = new Circle(3);

        Shape[] listOfShapes = {square, circle};

        for (Shape listOfShape : listOfShapes) {
            System.out.println(listOfShape.calculateSurface());
        }

    }

}
