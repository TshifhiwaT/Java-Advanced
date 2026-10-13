package Chapter8;

public class ProductRunner {
    static void main(String[] args) {

        try{
            Product p = new Product("code123", "microwave", 500, 5);
            p.increasePrice(15);
            p.sell(6);
            System.out.println(p);
        } catch (IllegalArgumentException | LowStockException |HighPriceIncreaseException ex){
            System.err.println(ex.getMessage());
        }
    }
}
