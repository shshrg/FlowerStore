package flower.store;
import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<FlowerPack>();
    }

    public void add(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }


    public double getPrice() {
        double sum = 0;
        for (int i = 0; i < flowerPacks.size(); ++i) {
            sum += flowerPacks.get(i).getPrice();
        }
        return sum;
    }
}
