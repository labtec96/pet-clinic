package com.example.petclinic.repositories;

import com.example.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ch on 2020-02-27
 */
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
