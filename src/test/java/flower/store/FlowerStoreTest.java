package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FlowerStoreTest {

    private static final double SEPALONE = 1;
    private static final double SEPALTWO = 2;
    private static final double SEPALTHREE = 3;

    private Store flowerStore;
    private Rose rose;
    private Tulip tulip;
    private Chamomile cham;

    @BeforeEach
    public void init() {
        flowerStore = new Store();

        rose = new Rose();
        rose.setSepalLength(SEPALONE);
        tulip = new Tulip();
        tulip.setSepalLength(SEPALTWO);
        cham = new Chamomile();
        cham.setSepalLength(SEPALTHREE);

        flowerStore.addFlower(rose);
        flowerStore.addFlower(tulip);
        flowerStore.addFlower(cham);
    }


    @Test
    public void testSearchSuccess() {

        Assertions.assertEquals(flowerStore.search(SEPALONE, 
                                            FlowerColor.RED, 
                                            FlowerType.ROSE), rose);

        Assertions.assertEquals(flowerStore.search(SEPALTWO, 
                                            FlowerColor.PINK, 
                                            FlowerType.TULIP), tulip);

        Assertions.assertEquals(flowerStore.search(SEPALTHREE, 
                                            FlowerColor.WHITE, 
                                            FlowerType.CHAMOMILE), cham);
    }

    @Test
    public void testSearchFail() {
        Assertions.assertNull(flowerStore.search(0, 
            FlowerColor.RED, 
            FlowerType.ROSE));
        
        Assertions.assertNull(flowerStore.search(SEPALTWO, 
            FlowerColor.BLUE, 
            FlowerType.TULIP));
        
        Assertions.assertNull(flowerStore.search(SEPALTHREE, 
            FlowerColor.WHITE, 
            FlowerType.ROSE));
    }
}
