package Chapter8;

/**
 *
 */
public class Product {
    private String code, description;
    private double price;
    private int qtyInStock;

    public Product(String code, String description, double price, int qtyInStock) {
        setCode(code);
        setDescription(description);
        setPrice(price);
        setQtyInStock(qtyInStock);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the product
     * @param description
     * @throws IllegalArgumentException
     */
    public void setDescription(String description) throws IllegalArgumentException {
        if (description.length() < 5){
            throw new IllegalArgumentException("Description should be at least 5 characters long"
            + "\nCurrent description: [" + description + "]");
        }
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public void sell(int qtyToSell) throws LowStockException{
        if (qtyToSell > qtyInStock){
                throw new LowStockException("Low on Stock");
        }
        this.qtyInStock -= qtyToSell;
    }

    public void increasePrice(double percentage) throws HighPriceIncreaseException{
        double increase = this.price * (percentage/100);
        if(increase >= 10){
            throw new HighPriceIncreaseException("Price increase is too high, Increase should be less than 10");
        }
        this.price += increase;
    }

    @Override
    public String toString() {
        return String.format("""
                Code           :  %s
                Description    :  %s
                Price          :  %.2f
                Qty In Stock   :  %d""", code, description, price, qtyInStock);
    }
}
