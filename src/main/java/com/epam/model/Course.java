package com.epam.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;

    @Column(name = "name")
    private String name;

    @Column(name = "starting_date")
    private LocalDate startingDate;

    @Column(name = "finishing_date")
    private LocalDate finishingDate;

    @ManyToMany
    Set<Student> students = new HashSet<>();
}
