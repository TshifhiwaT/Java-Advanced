package Chapter8;

/**
 * Thrown when a has low quantity in stock
 */
public class LowStockException extends Exception {
    public LowStockException(String message){
        super(message);
    }
}
