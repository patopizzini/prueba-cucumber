package stock_operations;

public class Operations {
    public static Stock buy(Stock appleStock, int quantity){
        appleStock.setStock(appleStock.getStock() - quantity);
        return appleStock;
    }

    public static Stock add(Stock appleStock, int quantity) {
        appleStock.setStock(appleStock.getStock() + quantity);
        return appleStock;
    }
}
