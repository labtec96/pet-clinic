package com.example.petclinic.services;

import com.example.petclinic.model.Owner;

import java.util.List;
import java.util.Set;

/**
 * Created by ch on 2020-02-12
 */
public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
