package com.teamtreehouse.core;

import javax.persistence.*;

/**
 * Created by Godzi on 3/28/2017.
 */

@MappedSuperclass
public abstract class BaseEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    @Version
    private Long version;

    protected BaseEntity() {
        id = null;
    }
}
