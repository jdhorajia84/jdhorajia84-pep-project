package DAO;

import java.util.List;
import java.util.Optional;


public interface BaseDao<T> {

    /**
     * Retrieves an object by its ID.
     */
    Optional<T> getById(int id);

    /**
     * Retrieves all objects in the system.
     */
    List<T> getAll();

    /**
     * Inserts a new object into the database.
     */
    T insert(T t);

    /**
     * Updates an existing object in the system.
     */
    boolean update(T t);

    /**
     * Deletes an object from the system.
     */
    boolean delete(T t);
}

