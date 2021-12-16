package example03;

import java.util.HashMap;
import java.util.Map;

/**
 * 1급 컬렉션 객체
 */
public class Store {

    private final Map<Product, Integer> inventory = new HashMap<>();

    public int getProductCount(Product product) {
        return this.inventory.get(product);
    }

    public void addInventory(Product product, int count) {
        inventory.put(product, count);
    }

    public boolean removeInventory(Product product, int count) {

        if (!inventory.containsKey(product)) {
            throw new IllegalArgumentException("해당 제품은 존재하지 않습니다.");
        }

        int stock = inventory.get(product);
        int remainStock = stock - count;

        if (remainStock < 0) {
            throw new IllegalArgumentException("현재 재고보다 많은 수량입니다.");
        }

        inventory.put(product, remainStock);

        return true;
    }

    public boolean hasProductByQuantity(Product product, int quantity) {

        if (!inventory.containsKey(product)) {
            throw new IllegalArgumentException("해당 제품은 존재하지 않습니다.");
        }

        int stock = inventory.get(product);

        return stock >= quantity;
    }

}
