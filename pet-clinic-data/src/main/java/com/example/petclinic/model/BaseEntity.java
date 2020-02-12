package com.example.petclinic.model;

import java.io.Serializable;

/**
 * Created by ch on 2020-02-12
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
