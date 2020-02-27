package com.example.petclinic.repositories;

import com.example.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ch on 2020-02-27
 */
public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);
}
