package com.example.petclinic.services.map;

import com.example.petclinic.model.Pet;
import com.example.petclinic.services.CrudService;
import com.example.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ch on 2020-02-12
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findAllById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
