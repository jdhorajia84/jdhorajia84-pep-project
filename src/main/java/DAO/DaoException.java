package DAO;

public class DaoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DaoException with the specified error message.
     */
    public DaoException(String message) {
        super(message);
    }

    /**
     * Constructs a new DaoException with the specified error message and cause.
     */
    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
