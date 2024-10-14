package flower.store;
import java.util.ArrayList;

public class Store {
    private ArrayList<Flower> flowers;

    public Store() {
        this.flowers = new ArrayList<Flower>();
    }

    public void add_flower(Flower fl) {
        this.flowers.add(fl);
    }

    public Flower search(double sepalLength, FlowerColor color, FlowerType flowerType) {
        for (int i = 0; i < flowers.size(); ++i) {
            if (flowers.get(i).getSepalLength() != sepalLength) {
                continue;
            }
            if (flowers.get(i).getColor() != color.toString()) {
                continue;
            }
            if (!flowers.get(i).getFlowerType().equals(flowerType)) {
                continue;
            }
            return flowers.get(i);
        }
        return null;
    }
}
