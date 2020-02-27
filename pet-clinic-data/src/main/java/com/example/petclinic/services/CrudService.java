package com.example.petclinic.services;

import java.util.Set;

/**
 * Created by ch on 2020-02-12
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
