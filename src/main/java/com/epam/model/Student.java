package com.epam.model;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    Set<Course> courses = new HashSet<>();

    @OneToMany
    Set<FeedBack> feedBacks = new HashSet<>();
}
