package com.epam.model;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Data
@Entity
@Table(name = "authorities")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "authority")
    private String authority;
}
