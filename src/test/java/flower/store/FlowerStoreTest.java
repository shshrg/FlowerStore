package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FlowerStoreTest {

    private static final double SEPAL1 = 1;
    private static final double SEPAL2 = 2;
    private static final double SEPAL3 = 3;

    private Store flowerStore;
    private Rose rose;
    private Tulip tulip;
    private Chamomile cham;

    @BeforeEach
    public void init() {
        flowerStore = new Store();

        rose = new Rose();
        rose.setSepalLength(SEPAL1);
        tulip = new Tulip();
        tulip.setSepalLength(SEPAL2);
        cham = new Chamomile();
        cham.setSepalLength(SEPAL3);

        flowerStore.addFlower(rose);
        flowerStore.addFlower(tulip);
        flowerStore.addFlower(cham);
    }


    @Test
    public void testSearchSuccess() {

        Assertions.assertEquals(flowerStore.search(SEPAL1, 
                                            FlowerColor.RED, 
                                            FlowerType.ROSE), rose);

        Assertions.assertEquals(flowerStore.search(SEPAL2, 
                                            FlowerColor.PINK, 
                                            FlowerType.TULIP), tulip);

        Assertions.assertEquals(flowerStore.search(SEPAL3, 
                                            FlowerColor.WHITE, 
                                            FlowerType.CHAMOMILE), cham);
    }

    @Test
    public void testSearchFail() {
        Assertions.assertNull(flowerStore.search(0, 
            FlowerColor.RED, 
            FlowerType.ROSE));
        
        Assertions.assertNull(flowerStore.search(SEPAL2, 
            FlowerColor.BLUE, 
            FlowerType.TULIP));
        
        Assertions.assertNull(flowerStore.search(SEPAL3, 
            FlowerColor.WHITE, 
            FlowerType.ROSE));
    }
}
