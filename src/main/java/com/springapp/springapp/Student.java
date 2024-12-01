package com.springapp.springapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Student")
public class Student {
    @Id
    @Column(name = "Id")
    int id;

    @Column(name = "Marks")
    private int marks;

    @Column(name = "Name")
    private String name;
}
