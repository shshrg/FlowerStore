package flower.store;

public class Store {
    private Flower[] flowers;

    public Flower search(double sepalLength, FlowerColor color, FlowerType flowerType) {
        for (Flower fl : flowers) {
            if (fl.getSepalLength() != sepalLength) {
                continue;
            }
            if (fl.getColor() != color.toString()) {
                continue;
            }
            if (fl.getFlowerType() != flowerType) {
                continue;
            }
            return fl;
        }
        return null;
    }
}
