package core.basesyntax;

public class Square extends Figure {
    private final double side;

    Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double area() {
        return Math.pow(side, 2);
    }

    @Override
    void draw() {
        System.out.println("Figure: square, area: " + area() + " sq. units, side: " + this.side
                + " units, color: " + getColor());
    }
}
