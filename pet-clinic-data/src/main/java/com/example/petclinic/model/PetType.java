package com.example.petclinic.model;

/**
 * Created by ch on 2020-02-11
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
