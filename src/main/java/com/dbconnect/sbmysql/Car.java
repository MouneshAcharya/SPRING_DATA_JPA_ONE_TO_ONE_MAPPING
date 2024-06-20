package com.dbconnect.sbmysql;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "car_1")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name="car_owner_id")
    private CarOwner carOwner;
}
