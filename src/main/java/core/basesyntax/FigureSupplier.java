package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double MIN_SIZE = 1.0;
    public static final double MAX_SIZE = 15.0;
    public static final double DEFAULT_RADIUS = 10.0;

    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                final double side = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new Square(colorSupplier.getRandomColor(), side);
            case 1:
                final double radius = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new Circle(colorSupplier.getRandomColor(), radius);
            case 2:
                final double width = random.nextDouble(MIN_SIZE, MAX_SIZE);
                final double height = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new Rectangle(colorSupplier.getRandomColor(), width, height);
            case 3:
                final double firstLeg = random.nextDouble(MIN_SIZE, MAX_SIZE);
                final double secondLeg = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case 4:
                final double bottomBase = random.nextDouble(MIN_SIZE, MAX_SIZE);
                final double topBase = random.nextDouble(MIN_SIZE, MAX_SIZE);
                final double height2 = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), bottomBase,
                        topBase, height2);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), DEFAULT_RADIUS);
    }
}
