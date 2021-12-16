package example03;

public class Customer {

    public boolean purchase(Store store, Product product, int count) {

        //TODO 샀을때 하는 행위들

        return store.removeInventory(product, count);
    }

}
