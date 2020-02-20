package com.example.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ch on 2020-02-11
 */
public class Vet extends  Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
