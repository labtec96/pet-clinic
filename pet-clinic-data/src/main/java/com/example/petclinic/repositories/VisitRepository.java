package com.example.petclinic.repositories;

import com.example.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ch on 2020-02-27
 */
public interface VisitRepository extends CrudRepository<Visit,Long> {
}
