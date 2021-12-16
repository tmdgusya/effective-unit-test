package example03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void purchaseSucceedsWhenEnoughInventory() {
        //given
        var store = new Store();
        store.addInventory(Product.SHAMPOO, 10);
        var customer = new Customer();

        //when
        boolean purchaseSucceedResult = customer.purchase(store, Product.SHAMPOO, 5);

        //then
        assertTrue(purchaseSucceedResult);
        assertEquals(5, store.getProductCount(Product.SHAMPOO));
    }

}