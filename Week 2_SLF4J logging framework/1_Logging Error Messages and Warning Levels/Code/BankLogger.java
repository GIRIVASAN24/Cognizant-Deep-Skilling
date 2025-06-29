import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankLogger {
    private static final Logger logger = LoggerFactory.getLogger(BankLogger.class);

    public static void main(String[] args) {
        logger.error("This is an error message from BankLogger");
        logger.warn("This is a warning message from BankLogger");

        // Optional messages for demonstration
        logger.info("BankLogger: informational message");
        logger.debug("BankLogger: debug message for developers");
    }
}
