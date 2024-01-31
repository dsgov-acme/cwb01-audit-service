package io.nuvalence.platform.audit.service.config.exception;

/**
 * Custom exception for unexpected run time situations.
 */
public class UnexpectedException extends RuntimeException {
    private static final long serialVersionUID = 8726229712858796681L;

    public UnexpectedException(String message) {
        super(message);
    }

    public UnexpectedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnexpectedException(Throwable cause) {
        super(cause);
    }
}
