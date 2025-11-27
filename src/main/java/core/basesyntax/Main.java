package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];

        FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = FIGURE_SUPPLIER.getRandomFigure();
            } else {
                figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            ((Drawable) figure).draw();
        }
    }
}
