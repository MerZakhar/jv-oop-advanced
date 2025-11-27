package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    void draw() {
        System.out.println("Figure: rectangle, area: " + area() + " sq. units, width: " + this.width
                + " units, height: " + this.height + " units, color: " + getColor());
    }
}
