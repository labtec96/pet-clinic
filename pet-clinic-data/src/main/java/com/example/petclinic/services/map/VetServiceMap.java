package com.example.petclinic.services.map;

import com.example.petclinic.model.Vet;
import com.example.petclinic.services.CrudService;
import com.example.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ch on 2020-02-12
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findAllById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
