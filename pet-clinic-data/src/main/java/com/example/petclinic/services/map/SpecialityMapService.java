package com.example.petclinic.services.map;

import com.example.petclinic.model.Speciality;
import com.example.petclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ch on 2020-02-20
 */
@Service
public class SpecialityMapService extends AbstractMapService <Speciality,Long> implements SpecialitiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findAllById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
