package com.company.core;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;

    @Version
    private Long version;

    public Long getId() {
        return id;
    }

    public BaseEntity(){
        id = null;
    }
}
