package com.example.petclinic.services;

import com.example.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by ch on 2020-02-12
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
