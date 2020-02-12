package com.example.petclinic.services;

import com.example.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by ch on 2020-02-12
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
