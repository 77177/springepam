package com.epam.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class FeedBack {

    @Id
    private int id;
}
