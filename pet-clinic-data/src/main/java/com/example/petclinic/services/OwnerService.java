package com.example.petclinic.services;

import com.example.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by ch on 2020-02-12
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
