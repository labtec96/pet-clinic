package com.example.petclinic.repositories;

import com.example.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ch on 2020-02-27
 */
public interface VetRepository extends CrudRepository<Vet,Long> {
}
