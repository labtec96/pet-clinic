package com.example.petclinic.model;

import java.util.Set;

/**
 * Created by ch on 2020-02-11
 */
public class Vet extends  Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
