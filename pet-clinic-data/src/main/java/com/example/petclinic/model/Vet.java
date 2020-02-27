package com.example.petclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ch on 2020-02-11
 */
@Entity
@Table(name = "vets")
public class Vet extends  Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vets_specialities", joinColumns = @JoinColumn(name = "vet_id"),
        inverseJoinColumns = @JoinColumn(name = "specialities_id"))
    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
