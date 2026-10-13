package Chapter8;

/**
 * Thrown when there is a high price increase on a product
 */
public class HighPriceIncreaseException extends Exception {
    public HighPriceIncreaseException(String message){
        super(message);
    }
}
