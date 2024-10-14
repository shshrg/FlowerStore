package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FlowerStoreTest {

    private Store flowerStore;
    private Rose rose;
    private Tulip tulip;
    private Chamomile cham;

    @BeforeEach
    public void init() {
        flowerStore = new Store();

        rose = new Rose();
        rose.setSepalLength(1);
        tulip = new Tulip();
        tulip.setSepalLength(2);
        cham = new Chamomile();
        cham.setSepalLength(2.5);

        flowerStore.addFlower(rose);
        flowerStore.addFlower(tulip);
        flowerStore.addFlower(cham);
    }


    @Test
    public void testSearchSuccess() {

        Assertions.assertEquals(flowerStore.search(1, 
                                            FlowerColor.RED, 
                                            FlowerType.ROSE), rose);

        Assertions.assertEquals(flowerStore.search(2, 
                                            FlowerColor.PINK, 
                                            FlowerType.TULIP), tulip);

        Assertions.assertEquals(flowerStore.search(2.5, 
                                            FlowerColor.WHITE, 
                                            FlowerType.CHAMOMILE), cham);
    }

    @Test
    public void testSearchFail() {
        Assertions.assertNull(flowerStore.search(0, 
            FlowerColor.RED, 
            FlowerType.ROSE));
        
        Assertions.assertNull(flowerStore.search(2, 
            FlowerColor.BLUE, 
            FlowerType.TULIP));
        
        Assertions.assertNull(flowerStore.search(2.5, 
            FlowerColor.WHITE, 
            FlowerType.ROSE));
    }
}
