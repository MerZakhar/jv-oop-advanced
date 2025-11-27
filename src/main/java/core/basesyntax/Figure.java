package core.basesyntax;

abstract class Figure {
    private final String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
