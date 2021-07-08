/**
 * 
 */
package io.qiot.manufacturing.edge.machinery.util.exception;

/**
 * @author andreabattaglia
 *
 */
public class DataValidationException extends Exception {

    public DataValidationException() {
        super();
    }

    public DataValidationException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataValidationException(String message) {
        super(message);
    }

    public DataValidationException(Throwable cause) {
        super(cause);
    }

}
