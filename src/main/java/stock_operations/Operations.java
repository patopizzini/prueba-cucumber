package stock_operations;

public class Operations {
    public static Stock buy(Stock appleStock, int quantity){
        appleStock.setStock_remaining(appleStock.getStock_remaining() - quantity);
        return appleStock;
    }

    public static Stock add(Stock appleStock, int quantity) {
        appleStock.setStock_remaining(appleStock.getStock_remaining() + quantity);
        return appleStock;
    }
}
