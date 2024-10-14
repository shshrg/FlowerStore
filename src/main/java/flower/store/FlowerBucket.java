package flower.store;

public class FlowerBucket {
    private FlowerPack[] flowerPacks;

    public FlowerBucket(FlowerPack[] flowerPacks) {
        this.flowerPacks = flowerPacks;
    }

    public double getPrice() {
        double sum = 0;
        for (FlowerPack fl : flowerPacks) {
            sum = sum + fl.getPrice();
        }
        return sum;
    }
}
