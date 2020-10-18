package stock_operations;

public class Stock {
    private int stock_remaining;

    public Stock(){

    }

    public Stock(int new_stock) {
        this.stock_remaining = new_stock;
    }

    public int getStock_remaining() {
        return stock_remaining;
    }

    public void setStock_remaining(int add_stock) {
        this.stock_remaining = add_stock;
    }
}
