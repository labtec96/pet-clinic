package com.example.petclinic.model;

import java.util.Set;

/**
 * Created by ch on 2020-02-11
 */
public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
